// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package soccersquad.proxies;

public class Team
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject teamMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SoccerSquad.Team";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Team_Captain("SoccerSquad.Team_Captain"),
		Team_Stadium("SoccerSquad.Team_Stadium");

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

	public Team(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Team(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject teamMendixObject)
	{
		if (teamMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, teamMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.teamMendixObject = teamMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Team.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static soccersquad.proxies.Team initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return soccersquad.proxies.Team.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static soccersquad.proxies.Team initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new soccersquad.proxies.Team(context, mendixObject);
	}

	public static soccersquad.proxies.Team load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return soccersquad.proxies.Team.initialize(context, mendixObject);
	}

	public static java.util.List<soccersquad.proxies.Team> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> soccersquad.proxies.Team.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
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
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Team_Captain
	 */
	public final soccersquad.proxies.Player getTeam_Captain() throws com.mendix.core.CoreException
	{
		return getTeam_Captain(getContext());
	}

	/**
	 * @param context
	 * @return value of Team_Captain
	 * @throws com.mendix.core.CoreException
	 */
	public final soccersquad.proxies.Player getTeam_Captain(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		soccersquad.proxies.Player result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Team_Captain.toString());
		if (identifier != null) {
			result = soccersquad.proxies.Player.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Team_Captain
	 * @param team_captain
	 */
	public final void setTeam_Captain(soccersquad.proxies.Player team_captain)
	{
		setTeam_Captain(getContext(), team_captain);
	}

	/**
	 * Set value of Team_Captain
	 * @param context
	 * @param team_captain
	 */
	public final void setTeam_Captain(com.mendix.systemwideinterfaces.core.IContext context, soccersquad.proxies.Player team_captain)
	{
		if (team_captain == null) {
			getMendixObject().setValue(context, MemberNames.Team_Captain.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Team_Captain.toString(), team_captain.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Team_Stadium
	 */
	public final soccersquad.proxies.Stadium getTeam_Stadium() throws com.mendix.core.CoreException
	{
		return getTeam_Stadium(getContext());
	}

	/**
	 * @param context
	 * @return value of Team_Stadium
	 * @throws com.mendix.core.CoreException
	 */
	public final soccersquad.proxies.Stadium getTeam_Stadium(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		soccersquad.proxies.Stadium result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Team_Stadium.toString());
		if (identifier != null) {
			result = soccersquad.proxies.Stadium.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Team_Stadium
	 * @param team_stadium
	 */
	public final void setTeam_Stadium(soccersquad.proxies.Stadium team_stadium)
	{
		setTeam_Stadium(getContext(), team_stadium);
	}

	/**
	 * Set value of Team_Stadium
	 * @param context
	 * @param team_stadium
	 */
	public final void setTeam_Stadium(com.mendix.systemwideinterfaces.core.IContext context, soccersquad.proxies.Stadium team_stadium)
	{
		if (team_stadium == null) {
			getMendixObject().setValue(context, MemberNames.Team_Stadium.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Team_Stadium.toString(), team_stadium.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return teamMendixObject;
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
			final soccersquad.proxies.Team that = (soccersquad.proxies.Team) obj;
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