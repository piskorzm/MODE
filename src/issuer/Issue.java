/**
 */
package issuer;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link issuer.Issue#getId <em>Id</em>}</li>
 *   <li>{@link issuer.Issue#getTitle <em>Title</em>}</li>
 *   <li>{@link issuer.Issue#getDescription <em>Description</em>}</li>
 *   <li>{@link issuer.Issue#getOpen <em>Open</em>}</li>
 *   <li>{@link issuer.Issue#getComments <em>Comments</em>}</li>
 *   <li>{@link issuer.Issue#getReportedBy <em>Reported By</em>}</li>
 *   <li>{@link issuer.Issue#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link issuer.Issue#getAffectedVersions <em>Affected Versions</em>}</li>
 *   <li>{@link issuer.Issue#getBlocking <em>Blocking</em>}</li>
 *   <li>{@link issuer.Issue#getBlockedBy <em>Blocked By</em>}</li>
 *   <li>{@link issuer.Issue#getDuplicateOf <em>Duplicate Of</em>}</li>
 *   <li>{@link issuer.Issue#getDuplicates <em>Duplicates</em>}</li>
 * </ul>
 * </p>
 *
 * @see issuer.IssuerPackage#getIssue()
 * @model abstract="true"
 * @generated
 */
public interface Issue extends EObject {
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
	 * @see issuer.IssuerPackage#getIssue_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link issuer.Issue#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see issuer.IssuerPackage#getIssue_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link issuer.Issue#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

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
	 * @see issuer.IssuerPackage#getIssue_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link issuer.Issue#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open</em>' attribute.
	 * @see #setOpen(Boolean)
	 * @see issuer.IssuerPackage#getIssue_Open()
	 * @model
	 * @generated
	 */
	Boolean getOpen();

	/**
	 * Sets the value of the '{@link issuer.Issue#getOpen <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open</em>' attribute.
	 * @see #getOpen()
	 * @generated
	 */
	void setOpen(Boolean value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link issuer.Comment}.
	 * It is bidirectional and its opposite is '{@link issuer.Comment#getRegardingIssue <em>Regarding Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see issuer.IssuerPackage#getIssue_Comments()
	 * @see issuer.Comment#getRegardingIssue
	 * @model opposite="regardingIssue" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * Returns the value of the '<em><b>Reported By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link issuer.Developer#getReportedIssues <em>Reported Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reported By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reported By</em>' reference.
	 * @see #setReportedBy(Developer)
	 * @see issuer.IssuerPackage#getIssue_ReportedBy()
	 * @see issuer.Developer#getReportedIssues
	 * @model opposite="reportedIssues"
	 * @generated
	 */
	Developer getReportedBy();

	/**
	 * Sets the value of the '{@link issuer.Issue#getReportedBy <em>Reported By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reported By</em>' reference.
	 * @see #getReportedBy()
	 * @generated
	 */
	void setReportedBy(Developer value);

	/**
	 * Returns the value of the '<em><b>Assigned To</b></em>' reference list.
	 * The list contents are of type {@link issuer.Developer}.
	 * It is bidirectional and its opposite is '{@link issuer.Developer#getAssignedIssues <em>Assigned Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned To</em>' reference list.
	 * @see issuer.IssuerPackage#getIssue_AssignedTo()
	 * @see issuer.Developer#getAssignedIssues
	 * @model opposite="assignedIssues"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' color='55,55,255' tool.name='Assigned to' tool.small.path=''"
	 * @generated
	 */
	EList<Developer> getAssignedTo();

	/**
	 * Returns the value of the '<em><b>Affected Versions</b></em>' reference list.
	 * The list contents are of type {@link issuer.Version}.
	 * It is bidirectional and its opposite is '{@link issuer.Version#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affected Versions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Versions</em>' reference list.
	 * @see issuer.IssuerPackage#getIssue_AffectedVersions()
	 * @see issuer.Version#getIssues
	 * @model opposite="issues"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' color='55,255,55' tool.name='Affected version' tool.small.path=''"
	 * @generated
	 */
	EList<Version> getAffectedVersions();

	/**
	 * Returns the value of the '<em><b>Blocked By</b></em>' reference list.
	 * The list contents are of type {@link issuer.Issue}.
	 * It is bidirectional and its opposite is '{@link issuer.Issue#getBlocking <em>Blocking</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocked By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocked By</em>' reference list.
	 * @see issuer.IssuerPackage#getIssue_BlockedBy()
	 * @see issuer.Issue#getBlocking
	 * @model opposite="blocking"
	 * @generated
	 */
	EList<Issue> getBlockedBy();

	/**
	 * Returns the value of the '<em><b>Blocking</b></em>' reference list.
	 * The list contents are of type {@link issuer.Issue}.
	 * It is bidirectional and its opposite is '{@link issuer.Issue#getBlockedBy <em>Blocked By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocking</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocking</em>' reference list.
	 * @see issuer.IssuerPackage#getIssue_Blocking()
	 * @see issuer.Issue#getBlockedBy
	 * @model opposite="blockedBy"
	 *        annotation="gmf.link target.decoration='arrow' style='solid' color='255,55,55' tool.name='Blocking' tool.small.path=''"
	 * @generated
	 */
	EList<Issue> getBlocking();

	/**
	 * Returns the value of the '<em><b>Duplicate Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link issuer.Issue#getDuplicates <em>Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duplicate Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duplicate Of</em>' reference.
	 * @see #setDuplicateOf(Issue)
	 * @see issuer.IssuerPackage#getIssue_DuplicateOf()
	 * @see issuer.Issue#getDuplicates
	 * @model opposite="duplicates"
	 *        annotation="gmf.link target.decoration='arrow' style='dot' color='155,155,155' tool.name='Duplicate of' tool.small.path=''"
	 * @generated
	 */
	Issue getDuplicateOf();

	/**
	 * Sets the value of the '{@link issuer.Issue#getDuplicateOf <em>Duplicate Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duplicate Of</em>' reference.
	 * @see #getDuplicateOf()
	 * @generated
	 */
	void setDuplicateOf(Issue value);

	/**
	 * Returns the value of the '<em><b>Duplicates</b></em>' reference list.
	 * The list contents are of type {@link issuer.Issue}.
	 * It is bidirectional and its opposite is '{@link issuer.Issue#getDuplicateOf <em>Duplicate Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duplicates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duplicates</em>' reference list.
	 * @see issuer.IssuerPackage#getIssue_Duplicates()
	 * @see issuer.Issue#getDuplicateOf
	 * @model opposite="duplicateOf"
	 * @generated
	 */
	EList<Issue> getDuplicates();

} // Issue
