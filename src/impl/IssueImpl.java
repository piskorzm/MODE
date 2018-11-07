/**
 */
package issuer.impl;

import issuer.Comment;
import issuer.Developer;
import issuer.Issue;
import issuer.IssuerPackage;
import issuer.Version;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link issuer.impl.IssueImpl#getId <em>Id</em>}</li>
 *   <li>{@link issuer.impl.IssueImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link issuer.impl.IssueImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link issuer.impl.IssueImpl#getOpen <em>Open</em>}</li>
 *   <li>{@link issuer.impl.IssueImpl#getOpenTime <em>Open Time</em>}</li>
 *   <li>{@link issuer.impl.IssueImpl#getCloseTime <em>Close Time</em>}</li>
 *   <li>{@link issuer.impl.IssueImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link issuer.impl.IssueImpl#getReportedBy <em>Reported By</em>}</li>
 *   <li>{@link issuer.impl.IssueImpl#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link issuer.impl.IssueImpl#getAffectedVersions <em>Affected Versions</em>}</li>
 *   <li>{@link issuer.impl.IssueImpl#getBlockedBy <em>Blocked By</em>}</li>
 *   <li>{@link issuer.impl.IssueImpl#getBlocking <em>Blocking</em>}</li>
 *   <li>{@link issuer.impl.IssueImpl#getDuplicateOf <em>Duplicate Of</em>}</li>
 *   <li>{@link issuer.impl.IssueImpl#getDuplicates <em>Duplicates</em>}</li>
 *   <li>{@link issuer.impl.IssueImpl#getDeapestBlocking <em>Deapest Blocking</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IssueImpl extends EObjectImpl implements Issue {
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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpen()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean OPEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpen()
	 * @generated
	 * @ordered
	 */
	protected Boolean open = OPEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpenTime() <em>Open Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date OPEN_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpenTime() <em>Open Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenTime()
	 * @generated
	 * @ordered
	 */
	protected Date openTime = OPEN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloseTime() <em>Close Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date CLOSE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloseTime() <em>Close Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseTime()
	 * @generated
	 * @ordered
	 */
	protected Date closeTime = CLOSE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The cached value of the '{@link #getReportedBy() <em>Reported By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportedBy()
	 * @generated
	 * @ordered
	 */
	protected Developer reportedBy;

	/**
	 * The cached value of the '{@link #getAssignedTo() <em>Assigned To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Developer> assignedTo;

	/**
	 * The cached value of the '{@link #getAffectedVersions() <em>Affected Versions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<Version> affectedVersions;

	/**
	 * The cached value of the '{@link #getBlockedBy() <em>Blocked By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> blockedBy;

	/**
	 * The cached value of the '{@link #getBlocking() <em>Blocking</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocking()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> blocking;

	/**
	 * The cached value of the '{@link #getDuplicateOf() <em>Duplicate Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuplicateOf()
	 * @generated
	 * @ordered
	 */
	protected Issue duplicateOf;

	/**
	 * The cached value of the '{@link #getDuplicates() <em>Duplicates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuplicates()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> duplicates;

	/**
	 * The default value of the '{@link #getDeapestBlocking() <em>Deapest Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeapestBlocking()
	 * @generated
	 * @ordered
	 */
	protected static final int DEAPEST_BLOCKING_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IssuerPackage.Literals.ISSUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.ISSUE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.ISSUE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.ISSUE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getOpen() {
		return open;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpen(Boolean newOpen) {
		Boolean oldOpen = open;
		open = newOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.ISSUE__OPEN, oldOpen, open));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getOpenTime() {
		return openTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenTime(Date newOpenTime) {
		Date oldOpenTime = openTime;
		openTime = newOpenTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.ISSUE__OPEN_TIME, oldOpenTime, openTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCloseTime() {
		return closeTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloseTime(Date newCloseTime) {
		Date oldCloseTime = closeTime;
		closeTime = newCloseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.ISSUE__CLOSE_TIME, oldCloseTime, closeTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectContainmentEList<Comment>(Comment.class, this, IssuerPackage.ISSUE__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Developer getReportedBy() {
		if (reportedBy != null && reportedBy.eIsProxy()) {
			InternalEObject oldReportedBy = (InternalEObject)reportedBy;
			reportedBy = (Developer)eResolveProxy(oldReportedBy);
			if (reportedBy != oldReportedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IssuerPackage.ISSUE__REPORTED_BY, oldReportedBy, reportedBy));
			}
		}
		return reportedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Developer basicGetReportedBy() {
		return reportedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportedBy(Developer newReportedBy) {
		Developer oldReportedBy = reportedBy;
		reportedBy = newReportedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.ISSUE__REPORTED_BY, oldReportedBy, reportedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Developer> getAssignedTo() {
		if (assignedTo == null) {
			assignedTo = new EObjectWithInverseResolvingEList.ManyInverse<Developer>(Developer.class, this, IssuerPackage.ISSUE__ASSIGNED_TO, IssuerPackage.DEVELOPER__ASSIGNED_ISSUES);
		}
		return assignedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Version> getAffectedVersions() {
		if (affectedVersions == null) {
			affectedVersions = new EObjectWithInverseResolvingEList.ManyInverse<Version>(Version.class, this, IssuerPackage.ISSUE__AFFECTED_VERSIONS, IssuerPackage.VERSION__ISSUES);
		}
		return affectedVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getBlockedBy() {
		if (blockedBy == null) {
			blockedBy = new EObjectWithInverseResolvingEList.ManyInverse<Issue>(Issue.class, this, IssuerPackage.ISSUE__BLOCKED_BY, IssuerPackage.ISSUE__BLOCKING);
		}
		return blockedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getBlocking() {
		if (blocking == null) {
			blocking = new EObjectWithInverseResolvingEList.ManyInverse<Issue>(Issue.class, this, IssuerPackage.ISSUE__BLOCKING, IssuerPackage.ISSUE__BLOCKED_BY);
		}
		return blocking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue getDuplicateOf() {
		if (duplicateOf != null && duplicateOf.eIsProxy()) {
			InternalEObject oldDuplicateOf = (InternalEObject)duplicateOf;
			duplicateOf = (Issue)eResolveProxy(oldDuplicateOf);
			if (duplicateOf != oldDuplicateOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IssuerPackage.ISSUE__DUPLICATE_OF, oldDuplicateOf, duplicateOf));
			}
		}
		return duplicateOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue basicGetDuplicateOf() {
		return duplicateOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuplicateOf(Issue newDuplicateOf, NotificationChain msgs) {
		Issue oldDuplicateOf = duplicateOf;
		duplicateOf = newDuplicateOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IssuerPackage.ISSUE__DUPLICATE_OF, oldDuplicateOf, newDuplicateOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuplicateOf(Issue newDuplicateOf) {
		if (newDuplicateOf != duplicateOf) {
			NotificationChain msgs = null;
			if (duplicateOf != null)
				msgs = ((InternalEObject)duplicateOf).eInverseRemove(this, IssuerPackage.ISSUE__DUPLICATES, Issue.class, msgs);
			if (newDuplicateOf != null)
				msgs = ((InternalEObject)newDuplicateOf).eInverseAdd(this, IssuerPackage.ISSUE__DUPLICATES, Issue.class, msgs);
			msgs = basicSetDuplicateOf(newDuplicateOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.ISSUE__DUPLICATE_OF, newDuplicateOf, newDuplicateOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getDuplicates() {
		if (duplicates == null) {
			duplicates = new EObjectWithInverseResolvingEList<Issue>(Issue.class, this, IssuerPackage.ISSUE__DUPLICATES, IssuerPackage.ISSUE__DUPLICATE_OF);
		}
		return duplicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getDeapestBlocking() {
		if (this.getBlocking().isEmpty()) {
			return 0;
		} else {
			ArrayList<Integer> blockingDeapths = new ArrayList<Integer>();
			for (Issue issue : this.getBlocking()) {
				blockingDeapths.add(issue.getDeapestBlocking());
			}
			return 1 + Collections.max(blockingDeapths);
		}
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
			case IssuerPackage.ISSUE__ASSIGNED_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignedTo()).basicAdd(otherEnd, msgs);
			case IssuerPackage.ISSUE__AFFECTED_VERSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAffectedVersions()).basicAdd(otherEnd, msgs);
			case IssuerPackage.ISSUE__BLOCKED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBlockedBy()).basicAdd(otherEnd, msgs);
			case IssuerPackage.ISSUE__BLOCKING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBlocking()).basicAdd(otherEnd, msgs);
			case IssuerPackage.ISSUE__DUPLICATE_OF:
				if (duplicateOf != null)
					msgs = ((InternalEObject)duplicateOf).eInverseRemove(this, IssuerPackage.ISSUE__DUPLICATES, Issue.class, msgs);
				return basicSetDuplicateOf((Issue)otherEnd, msgs);
			case IssuerPackage.ISSUE__DUPLICATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDuplicates()).basicAdd(otherEnd, msgs);
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
			case IssuerPackage.ISSUE__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
			case IssuerPackage.ISSUE__ASSIGNED_TO:
				return ((InternalEList<?>)getAssignedTo()).basicRemove(otherEnd, msgs);
			case IssuerPackage.ISSUE__AFFECTED_VERSIONS:
				return ((InternalEList<?>)getAffectedVersions()).basicRemove(otherEnd, msgs);
			case IssuerPackage.ISSUE__BLOCKED_BY:
				return ((InternalEList<?>)getBlockedBy()).basicRemove(otherEnd, msgs);
			case IssuerPackage.ISSUE__BLOCKING:
				return ((InternalEList<?>)getBlocking()).basicRemove(otherEnd, msgs);
			case IssuerPackage.ISSUE__DUPLICATE_OF:
				return basicSetDuplicateOf(null, msgs);
			case IssuerPackage.ISSUE__DUPLICATES:
				return ((InternalEList<?>)getDuplicates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IssuerPackage.ISSUE__ID:
				return getId();
			case IssuerPackage.ISSUE__TITLE:
				return getTitle();
			case IssuerPackage.ISSUE__DESCRIPTION:
				return getDescription();
			case IssuerPackage.ISSUE__OPEN:
				return getOpen();
			case IssuerPackage.ISSUE__OPEN_TIME:
				return getOpenTime();
			case IssuerPackage.ISSUE__CLOSE_TIME:
				return getCloseTime();
			case IssuerPackage.ISSUE__COMMENTS:
				return getComments();
			case IssuerPackage.ISSUE__REPORTED_BY:
				if (resolve) return getReportedBy();
				return basicGetReportedBy();
			case IssuerPackage.ISSUE__ASSIGNED_TO:
				return getAssignedTo();
			case IssuerPackage.ISSUE__AFFECTED_VERSIONS:
				return getAffectedVersions();
			case IssuerPackage.ISSUE__BLOCKED_BY:
				return getBlockedBy();
			case IssuerPackage.ISSUE__BLOCKING:
				return getBlocking();
			case IssuerPackage.ISSUE__DUPLICATE_OF:
				if (resolve) return getDuplicateOf();
				return basicGetDuplicateOf();
			case IssuerPackage.ISSUE__DUPLICATES:
				return getDuplicates();
			case IssuerPackage.ISSUE__DEAPEST_BLOCKING:
				return getDeapestBlocking();
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
			case IssuerPackage.ISSUE__ID:
				setId((Integer)newValue);
				return;
			case IssuerPackage.ISSUE__TITLE:
				setTitle((String)newValue);
				return;
			case IssuerPackage.ISSUE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IssuerPackage.ISSUE__OPEN:
				setOpen((Boolean)newValue);
				return;
			case IssuerPackage.ISSUE__OPEN_TIME:
				setOpenTime((Date)newValue);
				return;
			case IssuerPackage.ISSUE__CLOSE_TIME:
				setCloseTime((Date)newValue);
				return;
			case IssuerPackage.ISSUE__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case IssuerPackage.ISSUE__REPORTED_BY:
				setReportedBy((Developer)newValue);
				return;
			case IssuerPackage.ISSUE__ASSIGNED_TO:
				getAssignedTo().clear();
				getAssignedTo().addAll((Collection<? extends Developer>)newValue);
				return;
			case IssuerPackage.ISSUE__AFFECTED_VERSIONS:
				getAffectedVersions().clear();
				getAffectedVersions().addAll((Collection<? extends Version>)newValue);
				return;
			case IssuerPackage.ISSUE__BLOCKED_BY:
				getBlockedBy().clear();
				getBlockedBy().addAll((Collection<? extends Issue>)newValue);
				return;
			case IssuerPackage.ISSUE__BLOCKING:
				getBlocking().clear();
				getBlocking().addAll((Collection<? extends Issue>)newValue);
				return;
			case IssuerPackage.ISSUE__DUPLICATE_OF:
				setDuplicateOf((Issue)newValue);
				return;
			case IssuerPackage.ISSUE__DUPLICATES:
				getDuplicates().clear();
				getDuplicates().addAll((Collection<? extends Issue>)newValue);
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
			case IssuerPackage.ISSUE__ID:
				setId(ID_EDEFAULT);
				return;
			case IssuerPackage.ISSUE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case IssuerPackage.ISSUE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IssuerPackage.ISSUE__OPEN:
				setOpen(OPEN_EDEFAULT);
				return;
			case IssuerPackage.ISSUE__OPEN_TIME:
				setOpenTime(OPEN_TIME_EDEFAULT);
				return;
			case IssuerPackage.ISSUE__CLOSE_TIME:
				setCloseTime(CLOSE_TIME_EDEFAULT);
				return;
			case IssuerPackage.ISSUE__COMMENTS:
				getComments().clear();
				return;
			case IssuerPackage.ISSUE__REPORTED_BY:
				setReportedBy((Developer)null);
				return;
			case IssuerPackage.ISSUE__ASSIGNED_TO:
				getAssignedTo().clear();
				return;
			case IssuerPackage.ISSUE__AFFECTED_VERSIONS:
				getAffectedVersions().clear();
				return;
			case IssuerPackage.ISSUE__BLOCKED_BY:
				getBlockedBy().clear();
				return;
			case IssuerPackage.ISSUE__BLOCKING:
				getBlocking().clear();
				return;
			case IssuerPackage.ISSUE__DUPLICATE_OF:
				setDuplicateOf((Issue)null);
				return;
			case IssuerPackage.ISSUE__DUPLICATES:
				getDuplicates().clear();
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
			case IssuerPackage.ISSUE__ID:
				return id != ID_EDEFAULT;
			case IssuerPackage.ISSUE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case IssuerPackage.ISSUE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IssuerPackage.ISSUE__OPEN:
				return OPEN_EDEFAULT == null ? open != null : !OPEN_EDEFAULT.equals(open);
			case IssuerPackage.ISSUE__OPEN_TIME:
				return OPEN_TIME_EDEFAULT == null ? openTime != null : !OPEN_TIME_EDEFAULT.equals(openTime);
			case IssuerPackage.ISSUE__CLOSE_TIME:
				return CLOSE_TIME_EDEFAULT == null ? closeTime != null : !CLOSE_TIME_EDEFAULT.equals(closeTime);
			case IssuerPackage.ISSUE__COMMENTS:
				return comments != null && !comments.isEmpty();
			case IssuerPackage.ISSUE__REPORTED_BY:
				return reportedBy != null;
			case IssuerPackage.ISSUE__ASSIGNED_TO:
				return assignedTo != null && !assignedTo.isEmpty();
			case IssuerPackage.ISSUE__AFFECTED_VERSIONS:
				return affectedVersions != null && !affectedVersions.isEmpty();
			case IssuerPackage.ISSUE__BLOCKED_BY:
				return blockedBy != null && !blockedBy.isEmpty();
			case IssuerPackage.ISSUE__BLOCKING:
				return blocking != null && !blocking.isEmpty();
			case IssuerPackage.ISSUE__DUPLICATE_OF:
				return duplicateOf != null;
			case IssuerPackage.ISSUE__DUPLICATES:
				return duplicates != null && !duplicates.isEmpty();
			case IssuerPackage.ISSUE__DEAPEST_BLOCKING:
				return getDeapestBlocking() != DEAPEST_BLOCKING_EDEFAULT;
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
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", open: ");
		result.append(open);
		result.append(", openTime: ");
		result.append(openTime);
		result.append(", closeTime: ");
		result.append(closeTime);
		result.append(')');
		return result.toString();
	}

} //IssueImpl
