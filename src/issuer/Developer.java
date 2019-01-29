/**
 */
package issuer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Developer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link issuer.Developer#getId <em>Id</em>}</li>
 *   <li>{@link issuer.Developer#getFirstName <em>First Name</em>}</li>
 *   <li>{@link issuer.Developer#getSurename <em>Surename</em>}</li>
 *   <li>{@link issuer.Developer#getTeam <em>Team</em>}</li>
 *   <li>{@link issuer.Developer#getReportedIssues <em>Reported Issues</em>}</li>
 *   <li>{@link issuer.Developer#getAssignedIssues <em>Assigned Issues</em>}</li>
 *   <li>{@link issuer.Developer#getComments <em>Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @see issuer.IssuerPackage#getDeveloper()
 * @model annotation="gmf.node label='firstName, surename'"
 * @generated
 */
public interface Developer extends EObject {
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
	 * @see issuer.IssuerPackage#getDeveloper_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link issuer.Developer#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see issuer.IssuerPackage#getDeveloper_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link issuer.Developer#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Surename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surename</em>' attribute.
	 * @see #setSurename(String)
	 * @see issuer.IssuerPackage#getDeveloper_Surename()
	 * @model
	 * @generated
	 */
	String getSurename();

	/**
	 * Sets the value of the '{@link issuer.Developer#getSurename <em>Surename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surename</em>' attribute.
	 * @see #getSurename()
	 * @generated
	 */
	void setSurename(String value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link issuer.Team#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' container reference.
	 * @see #setTeam(Team)
	 * @see issuer.IssuerPackage#getDeveloper_Team()
	 * @see issuer.Team#getMembers
	 * @model opposite="members" transient="false"
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link issuer.Developer#getTeam <em>Team</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' container reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Reported Issues</b></em>' reference list.
	 * The list contents are of type {@link issuer.Issue}.
	 * It is bidirectional and its opposite is '{@link issuer.Issue#getReportedBy <em>Reported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reported Issues</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reported Issues</em>' reference list.
	 * @see issuer.IssuerPackage#getDeveloper_ReportedIssues()
	 * @see issuer.Issue#getReportedBy
	 * @model opposite="reportedBy"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' color='0,0,0' tool.name='Reported issue'"
	 * @generated
	 */
	EList<Issue> getReportedIssues();

	/**
	 * Returns the value of the '<em><b>Assigned Issues</b></em>' reference list.
	 * The list contents are of type {@link issuer.Issue}.
	 * It is bidirectional and its opposite is '{@link issuer.Issue#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Issues</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Issues</em>' reference list.
	 * @see issuer.IssuerPackage#getDeveloper_AssignedIssues()
	 * @see issuer.Issue#getAssignedTo
	 * @model opposite="assignedTo"
	 * @generated
	 */
	EList<Issue> getAssignedIssues();

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' reference list.
	 * The list contents are of type {@link issuer.Comment}.
	 * It is bidirectional and its opposite is '{@link issuer.Comment#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' reference list.
	 * @see issuer.IssuerPackage#getDeveloper_Comments()
	 * @see issuer.Comment#getAuthor
	 * @model opposite="author"
	 * @generated
	 */
	EList<Comment> getComments();

} // Developer
