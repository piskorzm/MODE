/**
 */
package issuer;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link issuer.Comment#getId <em>Id</em>}</li>
 *   <li>{@link issuer.Comment#getText <em>Text</em>}</li>
 *   <li>{@link issuer.Comment#getReplies <em>Replies</em>}</li>
 *   <li>{@link issuer.Comment#getRegardingIssue <em>Regarding Issue</em>}</li>
 *   <li>{@link issuer.Comment#getParentComment <em>Parent Comment</em>}</li>
 *   <li>{@link issuer.Comment#getAuthor <em>Author</em>}</li>
 * </ul>
 * </p>
 *
 * @see issuer.IssuerPackage#getComment()
 * @model annotation="gmf.node label='text'"
 * @generated
 */
public interface Comment extends EObject {
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
	 * @see issuer.IssuerPackage#getComment_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link issuer.Comment#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see issuer.IssuerPackage#getComment_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link issuer.Comment#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Replies</b></em>' containment reference list.
	 * The list contents are of type {@link issuer.Comment}.
	 * It is bidirectional and its opposite is '{@link issuer.Comment#getParentComment <em>Parent Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replies</em>' containment reference list.
	 * @see issuer.IssuerPackage#getComment_Replies()
	 * @see issuer.Comment#getParentComment
	 * @model opposite="parentComment" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Comment> getReplies();

	/**
	 * Returns the value of the '<em><b>Regarding Issue</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link issuer.Issue#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regarding Issue</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regarding Issue</em>' container reference.
	 * @see #setRegardingIssue(Issue)
	 * @see issuer.IssuerPackage#getComment_RegardingIssue()
	 * @see issuer.Issue#getComments
	 * @model opposite="comments" transient="false"
	 * @generated
	 */
	Issue getRegardingIssue();

	/**
	 * Sets the value of the '{@link issuer.Comment#getRegardingIssue <em>Regarding Issue</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regarding Issue</em>' container reference.
	 * @see #getRegardingIssue()
	 * @generated
	 */
	void setRegardingIssue(Issue value);

	/**
	 * Returns the value of the '<em><b>Parent Comment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link issuer.Comment#getReplies <em>Replies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Comment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Comment</em>' container reference.
	 * @see #setParentComment(Comment)
	 * @see issuer.IssuerPackage#getComment_ParentComment()
	 * @see issuer.Comment#getReplies
	 * @model opposite="replies" transient="false"
	 * @generated
	 */
	Comment getParentComment();

	/**
	 * Sets the value of the '{@link issuer.Comment#getParentComment <em>Parent Comment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Comment</em>' container reference.
	 * @see #getParentComment()
	 * @generated
	 */
	void setParentComment(Comment value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link issuer.Developer#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Developer)
	 * @see issuer.IssuerPackage#getComment_Author()
	 * @see issuer.Developer#getComments
	 * @model opposite="comments"
	 * @generated
	 */
	Developer getAuthor();

	/**
	 * Sets the value of the '{@link issuer.Comment#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Developer value);

} // Comment
