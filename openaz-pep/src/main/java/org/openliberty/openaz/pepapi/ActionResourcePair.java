package org.openliberty.openaz.pepapi;


/**
 * A convenient abstraction for an action - resource pair.
 * 
 * @author Ajith Nair, David Laurance, Darshak Kothari
 * 
 */
public final class ActionResourcePair {
	
	private final Object action;

	private final Object resource;
	
	/**
	 * Creates a new action - resource pair
	 * 
	 * @param action	an Object representing the action being performed.
	 * @param resource	an Object representing the resource on which the action is being performed.
	 */
	public ActionResourcePair(Object action, Object resource){
		this.resource = resource;
		this.action = action;
	}
	
	/**
	 * Returns the resource associated with this action - resource pair
	 * 
	 * @return an Object representing the resource.
	 */
	public Object getResource() {
		return resource;
	}
	
	/**
	 * Returns the action associated with this action - resource pair.
	 * 
	 * @return an Object representing the action.
	 */
	public Object getAction() {
		return action;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((action == null) ? 0 : action.hashCode());
		result = prime * result
				+ ((resource == null) ? 0 : resource.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ActionResourcePair other = (ActionResourcePair) obj;
		if (action == null) {
			if (other.action != null)
				return false;
		} else if (!action.equals(other.action)) {
			return false;
		}
		
		if (resource == null) {
			if (other.resource != null) {
				return false;
			}
		} else if (!resource.equals(other.resource)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nAction: " + action.toString());
		builder.append("\nResource: " + resource.toString());
		return builder.toString();
	}
	
}