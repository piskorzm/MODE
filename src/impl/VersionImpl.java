/**
 */
package issuer.impl;

import issuer.Issue;
import issuer.IssuerPackage;
import issuer.Product;
import issuer.Version;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link issuer.impl.VersionImpl#getId <em>Id</em>}</li>
 *   <li>{@link issuer.impl.VersionImpl#getName <em>Name</em>}</li>
 *   <li>{@link issuer.impl.VersionImpl#getReleaseTime <em>Release Time</em>}</li>
 *   <li>{@link issuer.impl.VersionImpl#getRootProduct <em>Root Product</em>}</li>
 *   <li>{@link issuer.impl.VersionImpl#getIssues <em>Issues</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionImpl extends EObjectImpl implements Version {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReleaseTime() <em>Release Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date RELEASE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleaseTime() <em>Release Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseTime()
	 * @generated
	 * @ordered
	 */
	protected Date releaseTime = RELEASE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIssues() <em>Issues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> issues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IssuerPackage.Literals.VERSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.VERSION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.VERSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getReleaseTime() {
		return releaseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseTime(Date newReleaseTime) {
		Date oldReleaseTime = releaseTime;
		releaseTime = newReleaseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.VERSION__RELEASE_TIME, oldReleaseTime, releaseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getRootProduct() {
		if (eContainerFeatureID() != IssuerPackage.VERSION__ROOT_PRODUCT) return null;
		return (Product)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootProduct(Product newRootProduct, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRootProduct, IssuerPackage.VERSION__ROOT_PRODUCT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootProduct(Product newRootProduct) {
		if (newRootProduct != eInternalContainer() || (eContainerFeatureID() != IssuerPackage.VERSION__ROOT_PRODUCT && newRootProduct != null)) {
			if (EcoreUtil.isAncestor(this, newRootProduct))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRootProduct != null)
				msgs = ((InternalEObject)newRootProduct).eInverseAdd(this, IssuerPackage.PRODUCT__VERSIONS, Product.class, msgs);
			msgs = basicSetRootProduct(newRootProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.VERSION__ROOT_PRODUCT, newRootProduct, newRootProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getIssues() {
		if (issues == null) {
			issues = new EObjectWithInverseResolvingEList.ManyInverse<Issue>(Issue.class, this, IssuerPackage.VERSION__ISSUES, IssuerPackage.ISSUE__AFFECTED_VERSIONS);
		}
		return issues;
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
			case IssuerPackage.VERSION__ROOT_PRODUCT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRootProduct((Product)otherEnd, msgs);
			case IssuerPackage.VERSION__ISSUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIssues()).basicAdd(otherEnd, msgs);
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
			case IssuerPackage.VERSION__ROOT_PRODUCT:
				return basicSetRootProduct(null, msgs);
			case IssuerPackage.VERSION__ISSUES:
				return ((InternalEList<?>)getIssues()).basicRemove(otherEnd, msgs);
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
			case IssuerPackage.VERSION__ROOT_PRODUCT:
				return eInternalContainer().eInverseRemove(this, IssuerPackage.PRODUCT__VERSIONS, Product.class, msgs);
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
			case IssuerPackage.VERSION__ID:
				return getId();
			case IssuerPackage.VERSION__NAME:
				return getName();
			case IssuerPackage.VERSION__RELEASE_TIME:
				return getReleaseTime();
			case IssuerPackage.VERSION__ROOT_PRODUCT:
				return getRootProduct();
			case IssuerPackage.VERSION__ISSUES:
				return getIssues();
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
			case IssuerPackage.VERSION__ID:
				setId((Integer)newValue);
				return;
			case IssuerPackage.VERSION__NAME:
				setName((String)newValue);
				return;
			case IssuerPackage.VERSION__RELEASE_TIME:
				setReleaseTime((Date)newValue);
				return;
			case IssuerPackage.VERSION__ROOT_PRODUCT:
				setRootProduct((Product)newValue);
				return;
			case IssuerPackage.VERSION__ISSUES:
				getIssues().clear();
				getIssues().addAll((Collection<? extends Issue>)newValue);
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
			case IssuerPackage.VERSION__ID:
				setId(ID_EDEFAULT);
				return;
			case IssuerPackage.VERSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IssuerPackage.VERSION__RELEASE_TIME:
				setReleaseTime(RELEASE_TIME_EDEFAULT);
				return;
			case IssuerPackage.VERSION__ROOT_PRODUCT:
				setRootProduct((Product)null);
				return;
			case IssuerPackage.VERSION__ISSUES:
				getIssues().clear();
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
			case IssuerPackage.VERSION__ID:
				return id != ID_EDEFAULT;
			case IssuerPackage.VERSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IssuerPackage.VERSION__RELEASE_TIME:
				return RELEASE_TIME_EDEFAULT == null ? releaseTime != null : !RELEASE_TIME_EDEFAULT.equals(releaseTime);
			case IssuerPackage.VERSION__ROOT_PRODUCT:
				return getRootProduct() != null;
			case IssuerPackage.VERSION__ISSUES:
				return issues != null && !issues.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(", releaseTime: ");
		result.append(releaseTime);
		result.append(')');
		return result.toString();
	}

} //VersionImpl
