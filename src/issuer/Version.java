/**
 */
package issuer;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link issuer.Version#getId <em>Id</em>}</li>
 *   <li>{@link issuer.Version#getName <em>Name</em>}</li>
 *   <li>{@link issuer.Version#getDescription <em>Description</em>}</li>
 *   <li>{@link issuer.Version#getRootProduct <em>Root Product</em>}</li>
 *   <li>{@link issuer.Version#getIssues <em>Issues</em>}</li>
 * </ul>
 * </p>
 *
 * @see issuer.IssuerPackage#getVersion()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Version extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see issuer.IssuerPackage#getVersion_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link issuer.Version#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see issuer.IssuerPackage#getVersion_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link issuer.Version#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see issuer.IssuerPackage#getVersion_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link issuer.Version#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Root Product</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link issuer.Product#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Product</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Product</em>' container reference.
	 * @see #setRootProduct(Product)
	 * @see issuer.IssuerPackage#getVersion_RootProduct()
	 * @see issuer.Product#getVersions
	 * @model opposite="versions" transient="false"
	 * @generated
	 */
	Product getRootProduct();

	/**
	 * Sets the value of the '{@link issuer.Version#getRootProduct <em>Root Product</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Product</em>' container reference.
	 * @see #getRootProduct()
	 * @generated
	 */
	void setRootProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' reference list.
	 * The list contents are of type {@link issuer.Issue}.
	 * It is bidirectional and its opposite is '{@link issuer.Issue#getAffectedVersions <em>Affected Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issues</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' reference list.
	 * @see issuer.IssuerPackage#getVersion_Issues()
	 * @see issuer.Issue#getAffectedVersions
	 * @model opposite="affectedVersions"
	 * @generated
	 */
	EList<Issue> getIssues();

} // Version
