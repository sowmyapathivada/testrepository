// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

public class WorkflowCurrentActivity
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject workflowCurrentActivityMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "System.WorkflowCurrentActivity";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Action("Action"),
		WorkflowCurrentActivity_ActivityDetails("System.WorkflowCurrentActivity_ActivityDetails"),
		WorkflowCurrentActivity_ApplicableTargets("System.WorkflowCurrentActivity_ApplicableTargets"),
		WorkflowCurrentActivity_JumpToTarget("System.WorkflowCurrentActivity_JumpToTarget");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public WorkflowCurrentActivity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected WorkflowCurrentActivity(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject workflowCurrentActivityMendixObject)
	{
		if (workflowCurrentActivityMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, workflowCurrentActivityMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.workflowCurrentActivityMendixObject = workflowCurrentActivityMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'WorkflowCurrentActivity.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static system.proxies.WorkflowCurrentActivity initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return system.proxies.WorkflowCurrentActivity.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static system.proxies.WorkflowCurrentActivity initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new system.proxies.WorkflowCurrentActivity(context, mendixObject);
	}

	public static system.proxies.WorkflowCurrentActivity load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return system.proxies.WorkflowCurrentActivity.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * Set value of Action
	 * @param action
	 */
	public final system.proxies.WorkflowCurrentActivityAction getAction()
	{
		return getAction(getContext());
	}

	/**
	 * @param context
	 * @return value of Action
	 */
	public final system.proxies.WorkflowCurrentActivityAction getAction(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Action.toString());
		if (obj == null) {
			return null;
		}
		return system.proxies.WorkflowCurrentActivityAction.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Action
	 * @param action
	 */
	public final void setAction(system.proxies.WorkflowCurrentActivityAction action)
	{
		setAction(getContext(), action);
	}

	/**
	 * Set value of Action
	 * @param context
	 * @param action
	 */
	public final void setAction(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.WorkflowCurrentActivityAction action)
	{
		if (action != null) {
			getMendixObject().setValue(context, MemberNames.Action.toString(), action.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.Action.toString(), null);
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of WorkflowCurrentActivity_ActivityDetails
	 */
	public final system.proxies.WorkflowActivityDetails getWorkflowCurrentActivity_ActivityDetails() throws com.mendix.core.CoreException
	{
		return getWorkflowCurrentActivity_ActivityDetails(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowCurrentActivity_ActivityDetails
	 * @throws com.mendix.core.CoreException
	 */
	public final system.proxies.WorkflowActivityDetails getWorkflowCurrentActivity_ActivityDetails(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.WorkflowActivityDetails result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkflowCurrentActivity_ActivityDetails.toString());
		if (identifier != null) {
			result = system.proxies.WorkflowActivityDetails.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of WorkflowCurrentActivity_ActivityDetails
	 * @param workflowcurrentactivity_activitydetails
	 */
	public final void setWorkflowCurrentActivity_ActivityDetails(system.proxies.WorkflowActivityDetails workflowcurrentactivity_activitydetails)
	{
		setWorkflowCurrentActivity_ActivityDetails(getContext(), workflowcurrentactivity_activitydetails);
	}

	/**
	 * Set value of WorkflowCurrentActivity_ActivityDetails
	 * @param context
	 * @param workflowcurrentactivity_activitydetails
	 */
	public final void setWorkflowCurrentActivity_ActivityDetails(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.WorkflowActivityDetails workflowcurrentactivity_activitydetails)
	{
		if (workflowcurrentactivity_activitydetails == null) {
			getMendixObject().setValue(context, MemberNames.WorkflowCurrentActivity_ActivityDetails.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.WorkflowCurrentActivity_ActivityDetails.toString(), workflowcurrentactivity_activitydetails.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of WorkflowCurrentActivity_ApplicableTargets
	 */
	public final java.util.List<system.proxies.WorkflowActivityDetails> getWorkflowCurrentActivity_ApplicableTargets() throws com.mendix.core.CoreException
	{
		return getWorkflowCurrentActivity_ApplicableTargets(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowCurrentActivity_ApplicableTargets
	 * @throws com.mendix.core.CoreException
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<system.proxies.WorkflowActivityDetails> getWorkflowCurrentActivity_ApplicableTargets(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<system.proxies.WorkflowActivityDetails> result = new java.util.ArrayList<>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.WorkflowCurrentActivity_ApplicableTargets.toString());
		if (valueObject == null) {
			return result;
		}
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject)) {
			result.add(system.proxies.WorkflowActivityDetails.initialize(context, mendixObject));
		}
		return result;
	}

	/**
	 * Set value of WorkflowCurrentActivity_ApplicableTargets
	 * @param workflowcurrentactivity_applicabletargets
	 */
	public final void setWorkflowCurrentActivity_ApplicableTargets(java.util.List<system.proxies.WorkflowActivityDetails> workflowcurrentactivity_applicabletargets)
	{
		setWorkflowCurrentActivity_ApplicableTargets(getContext(), workflowcurrentactivity_applicabletargets);
	}

	/**
	 * Set value of WorkflowCurrentActivity_ApplicableTargets
	 * @param context
	 * @param workflowcurrentactivity_applicabletargets
	 */
	public final void setWorkflowCurrentActivity_ApplicableTargets(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<system.proxies.WorkflowActivityDetails> workflowcurrentactivity_applicabletargets)
	{
		var identifiers = workflowcurrentactivity_applicabletargets
			.stream()
			.map(proxyObject -> proxyObject.getMendixObject().getId())
			.collect(java.util.stream.Collectors.toList());
		
		getMendixObject().setValue(context, MemberNames.WorkflowCurrentActivity_ApplicableTargets.toString(), identifiers);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of WorkflowCurrentActivity_JumpToTarget
	 */
	public final system.proxies.WorkflowActivityDetails getWorkflowCurrentActivity_JumpToTarget() throws com.mendix.core.CoreException
	{
		return getWorkflowCurrentActivity_JumpToTarget(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowCurrentActivity_JumpToTarget
	 * @throws com.mendix.core.CoreException
	 */
	public final system.proxies.WorkflowActivityDetails getWorkflowCurrentActivity_JumpToTarget(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.WorkflowActivityDetails result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkflowCurrentActivity_JumpToTarget.toString());
		if (identifier != null) {
			result = system.proxies.WorkflowActivityDetails.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of WorkflowCurrentActivity_JumpToTarget
	 * @param workflowcurrentactivity_jumptotarget
	 */
	public final void setWorkflowCurrentActivity_JumpToTarget(system.proxies.WorkflowActivityDetails workflowcurrentactivity_jumptotarget)
	{
		setWorkflowCurrentActivity_JumpToTarget(getContext(), workflowcurrentactivity_jumptotarget);
	}

	/**
	 * Set value of WorkflowCurrentActivity_JumpToTarget
	 * @param context
	 * @param workflowcurrentactivity_jumptotarget
	 */
	public final void setWorkflowCurrentActivity_JumpToTarget(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.WorkflowActivityDetails workflowcurrentactivity_jumptotarget)
	{
		if (workflowcurrentactivity_jumptotarget == null) {
			getMendixObject().setValue(context, MemberNames.WorkflowCurrentActivity_JumpToTarget.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.WorkflowCurrentActivity_JumpToTarget.toString(), workflowcurrentactivity_jumptotarget.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return workflowCurrentActivityMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final system.proxies.WorkflowCurrentActivity that = (system.proxies.WorkflowCurrentActivity) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
