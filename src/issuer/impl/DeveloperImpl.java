/**
 */
package issuer.impl;

import issuer.Comment;
import issuer.Developer;
import issuer.Issue;
import issuer.IssuerPackage;
import issuer.Team;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Developer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link issuer.impl.DeveloperImpl#getId <em>Id</em>}</li>
 *   <li>{@link issuer.impl.DeveloperImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link issuer.impl.DeveloperImpl#getSurename <em>Surename</em>}</li>
 *   <li>{@link issuer.impl.DeveloperImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link issuer.impl.DeveloperImpl#getReportedIssues <em>Reported Issues</em>}</li>
 *   <li>{@link issuer.impl.DeveloperImpl#getAssignedIssues <em>Assigned Issues</em>}</li>
 *   <li>{@link issuer.impl.DeveloperImpl#getComments <em>Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeveloperImpl extends EObjectImpl implements Developer {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSurename() <em>Surename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurename()
	 * @generated
	 * @ordered
	 */
	protected static final String SURENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurename() <em>Surename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurename()
	 * @generated
	 * @ordered
	 */
	protected String surename = SURENAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReportedIssues() <em>Reported Issues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportedIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> reportedIssues;

	/**
	 * The cached value of the '{@link #getAssignedIssues() <em>Assigned Issues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> assignedIssues;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeveloperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IssuerPackage.Literals.DEVELOPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.DEVELOPER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.DEVELOPER__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSurename() {
		return surename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurename(String newSurename) {
		String oldSurename = surename;
		surename = newSurename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.DEVELOPER__SURENAME, oldSurename, surename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getTeam() {
		if (eContainerFeatureID() != IssuerPackage.DEVELOPER__TEAM) return null;
		return (Team)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeam(Team newTeam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTeam, IssuerPackage.DEVELOPER__TEAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeam(Team newTeam) {
		if (newTeam != eInternalContainer() || (eContainerFeatureID() != IssuerPackage.DEVELOPER__TEAM && newTeam != null)) {
			if (EcoreUtil.isAncestor(this, newTeam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTeam != null)
				msgs = ((InternalEObject)newTeam).eInverseAdd(this, IssuerPackage.TEAM__MEMBERS, Team.class, msgs);
			msgs = basicSetTeam(newTeam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.DEVELOPER__TEAM, newTeam, newTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getReportedIssues() {
		if (reportedIssues == null) {
			reportedIssues = new EObjectWithInverseResolvingEList<Issue>(Issue.class, this, IssuerPackage.DEVELOPER__REPORTED_ISSUES, IssuerPackage.ISSUE__REPORTED_BY);
		}
		return reportedIssues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getAssignedIssues() {
		if (assignedIssues == null) {
			assignedIssues = new EObjectWithInverseResolvingEList.ManyInverse<Issue>(Issue.class, this, IssuerPackage.DEVELOPER__ASSIGNED_ISSUES, IssuerPackage.ISSUE__ASSIGNED_TO);
		}
		return assignedIssues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectWithInverseResolvingEList<Comment>(Comment.class, this, IssuerPackage.DEVELOPER__COMMENTS, IssuerPackage.COMMENT__AUTHOR);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IssuerPackage.DEVELOPER__TEAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTeam((Team)otherEnd, msgs);
			case IssuerPackage.DEVELOPER__REPORTED_ISSUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReportedIssues()).basicAdd(otherEnd, msgs);
			case IssuerPackage.DEVELOPER__ASSIGNED_ISSUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignedIssues()).basicAdd(otherEnd, msgs);
			case IssuerPackage.DEVELOPER__COMMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComments()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IssuerPackage.DEVELOPER__TEAM:
				return basicSetTeam(null, msgs);
			case IssuerPackage.DEVELOPER__REPORTED_ISSUES:
				return ((InternalEList<?>)getReportedIssues()).basicRemove(otherEnd, msgs);
			case IssuerPackage.DEVELOPER__ASSIGNED_ISSUES:
				return ((InternalEList<?>)getAssignedIssues()).basicRemove(otherEnd, msgs);
			case IssuerPackage.DEVELOPER__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case IssuerPackage.DEVELOPER__TEAM:
				return eInternalContainer().eInverseRemove(this, IssuerPackage.TEAM__MEMBERS, Team.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IssuerPackage.DEVELOPER__ID:
				return getId();
			case IssuerPackage.DEVELOPER__FIRST_NAME:
				return getFirstName();
			case IssuerPackage.DEVELOPER__SURENAME:
				return getSurename();
			case IssuerPackage.DEVELOPER__TEAM:
				return getTeam();
			case IssuerPackage.DEVELOPER__REPORTED_ISSUES:
				return getReportedIssues();
			case IssuerPackage.DEVELOPER__ASSIGNED_ISSUES:
				return getAssignedIssues();
			case IssuerPackage.DEVELOPER__COMMENTS:
				return getComments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IssuerPackage.DEVELOPER__ID:
				setId((Integer)newValue);
				return;
			case IssuerPackage.DEVELOPER__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case IssuerPackage.DEVELOPER__SURENAME:
				setSurename((String)newValue);
				return;
			case IssuerPackage.DEVELOPER__TEAM:
				setTeam((Team)newValue);
				return;
			case IssuerPackage.DEVELOPER__REPORTED_ISSUES:
				getReportedIssues().clear();
				getReportedIssues().addAll((Collection<? extends Issue>)newValue);
				return;
			case IssuerPackage.DEVELOPER__ASSIGNED_ISSUES:
				getAssignedIssues().clear();
				getAssignedIssues().addAll((Collection<? extends Issue>)newValue);
				return;
			case IssuerPackage.DEVELOPER__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IssuerPackage.DEVELOPER__ID:
				setId(ID_EDEFAULT);
				return;
			case IssuerPackage.DEVELOPER__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case IssuerPackage.DEVELOPER__SURENAME:
				setSurename(SURENAME_EDEFAULT);
				return;
			case IssuerPackage.DEVELOPER__TEAM:
				setTeam((Team)null);
				return;
			case IssuerPackage.DEVELOPER__REPORTED_ISSUES:
				getReportedIssues().clear();
				return;
			case IssuerPackage.DEVELOPER__ASSIGNED_ISSUES:
				getAssignedIssues().clear();
				return;
			case IssuerPackage.DEVELOPER__COMMENTS:
				getComments().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IssuerPackage.DEVELOPER__ID:
				return id != ID_EDEFAULT;
			case IssuerPackage.DEVELOPER__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case IssuerPackage.DEVELOPER__SURENAME:
				return SURENAME_EDEFAULT == null ? surename != null : !SURENAME_EDEFAULT.equals(surename);
			case IssuerPackage.DEVELOPER__TEAM:
				return getTeam() != null;
			case IssuerPackage.DEVELOPER__REPORTED_ISSUES:
				return reportedIssues != null && !reportedIssues.isEmpty();
			case IssuerPackage.DEVELOPER__ASSIGNED_ISSUES:
				return assignedIssues != null && !assignedIssues.isEmpty();
			case IssuerPackage.DEVELOPER__COMMENTS:
				return comments != null && !comments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", surename: ");
		result.append(surename);
		result.append(')');
		return result.toString();
	}

} //DeveloperImpl
