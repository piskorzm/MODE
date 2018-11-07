/**
 */
package issuer.impl;

import issuer.Comment;
import issuer.Developer;
import issuer.Issue;
import issuer.IssuerPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link issuer.impl.CommentImpl#getId <em>Id</em>}</li>
 *   <li>{@link issuer.impl.CommentImpl#getText <em>Text</em>}</li>
 *   <li>{@link issuer.impl.CommentImpl#getTime <em>Time</em>}</li>
 *   <li>{@link issuer.impl.CommentImpl#getReplies <em>Replies</em>}</li>
 *   <li>{@link issuer.impl.CommentImpl#getRegardingIssue <em>Regarding Issue</em>}</li>
 *   <li>{@link issuer.impl.CommentImpl#getParentComment <em>Parent Comment</em>}</li>
 *   <li>{@link issuer.impl.CommentImpl#getAuthor <em>Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommentImpl extends EObjectImpl implements Comment {
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
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReplies() <em>Replies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplies()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> replies;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Developer author;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IssuerPackage.Literals.COMMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.COMMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.COMMENT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.COMMENT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getReplies() {
		if (replies == null) {
			replies = new EObjectContainmentEList<Comment>(Comment.class, this, IssuerPackage.COMMENT__REPLIES);
		}
		return replies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue getRegardingIssue() {
		if (eContainerFeatureID() != IssuerPackage.COMMENT__REGARDING_ISSUE) return null;
		return (Issue)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegardingIssue(Issue newRegardingIssue, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRegardingIssue, IssuerPackage.COMMENT__REGARDING_ISSUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegardingIssue(Issue newRegardingIssue) {
		if (newRegardingIssue != eInternalContainer() || (eContainerFeatureID() != IssuerPackage.COMMENT__REGARDING_ISSUE && newRegardingIssue != null)) {
			if (EcoreUtil.isAncestor(this, newRegardingIssue))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRegardingIssue != null)
				msgs = ((InternalEObject)newRegardingIssue).eInverseAdd(this, IssuerPackage.ISSUE__COMMENTS, Issue.class, msgs);
			msgs = basicSetRegardingIssue(newRegardingIssue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.COMMENT__REGARDING_ISSUE, newRegardingIssue, newRegardingIssue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getParentComment() {
		if (eContainerFeatureID() != IssuerPackage.COMMENT__PARENT_COMMENT) return null;
		return (Comment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentComment(Comment newParentComment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentComment, IssuerPackage.COMMENT__PARENT_COMMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentComment(Comment newParentComment) {
		if (newParentComment != eInternalContainer() || (eContainerFeatureID() != IssuerPackage.COMMENT__PARENT_COMMENT && newParentComment != null)) {
			if (EcoreUtil.isAncestor(this, newParentComment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentComment != null)
				msgs = ((InternalEObject)newParentComment).eInverseAdd(this, IssuerPackage.COMMENT__REPLIES, Comment.class, msgs);
			msgs = basicSetParentComment(newParentComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.COMMENT__PARENT_COMMENT, newParentComment, newParentComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Developer getAuthor() {
		if (author != null && author.eIsProxy()) {
			InternalEObject oldAuthor = (InternalEObject)author;
			author = (Developer)eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IssuerPackage.COMMENT__AUTHOR, oldAuthor, author));
			}
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Developer basicGetAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Developer newAuthor, NotificationChain msgs) {
		Developer oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IssuerPackage.COMMENT__AUTHOR, oldAuthor, newAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Developer newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, IssuerPackage.DEVELOPER__COMMENTS, Developer.class, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, IssuerPackage.DEVELOPER__COMMENTS, Developer.class, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssuerPackage.COMMENT__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IssuerPackage.COMMENT__REGARDING_ISSUE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRegardingIssue((Issue)otherEnd, msgs);
			case IssuerPackage.COMMENT__PARENT_COMMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentComment((Comment)otherEnd, msgs);
			case IssuerPackage.COMMENT__AUTHOR:
				if (author != null)
					msgs = ((InternalEObject)author).eInverseRemove(this, IssuerPackage.DEVELOPER__COMMENTS, Developer.class, msgs);
				return basicSetAuthor((Developer)otherEnd, msgs);
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
			case IssuerPackage.COMMENT__REPLIES:
				return ((InternalEList<?>)getReplies()).basicRemove(otherEnd, msgs);
			case IssuerPackage.COMMENT__REGARDING_ISSUE:
				return basicSetRegardingIssue(null, msgs);
			case IssuerPackage.COMMENT__PARENT_COMMENT:
				return basicSetParentComment(null, msgs);
			case IssuerPackage.COMMENT__AUTHOR:
				return basicSetAuthor(null, msgs);
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
			case IssuerPackage.COMMENT__REGARDING_ISSUE:
				return eInternalContainer().eInverseRemove(this, IssuerPackage.ISSUE__COMMENTS, Issue.class, msgs);
			case IssuerPackage.COMMENT__PARENT_COMMENT:
				return eInternalContainer().eInverseRemove(this, IssuerPackage.COMMENT__REPLIES, Comment.class, msgs);
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
			case IssuerPackage.COMMENT__ID:
				return getId();
			case IssuerPackage.COMMENT__TEXT:
				return getText();
			case IssuerPackage.COMMENT__TIME:
				return getTime();
			case IssuerPackage.COMMENT__REPLIES:
				return getReplies();
			case IssuerPackage.COMMENT__REGARDING_ISSUE:
				return getRegardingIssue();
			case IssuerPackage.COMMENT__PARENT_COMMENT:
				return getParentComment();
			case IssuerPackage.COMMENT__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
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
			case IssuerPackage.COMMENT__ID:
				setId((Integer)newValue);
				return;
			case IssuerPackage.COMMENT__TEXT:
				setText((String)newValue);
				return;
			case IssuerPackage.COMMENT__TIME:
				setTime((Date)newValue);
				return;
			case IssuerPackage.COMMENT__REPLIES:
				getReplies().clear();
				getReplies().addAll((Collection<? extends Comment>)newValue);
				return;
			case IssuerPackage.COMMENT__REGARDING_ISSUE:
				setRegardingIssue((Issue)newValue);
				return;
			case IssuerPackage.COMMENT__PARENT_COMMENT:
				setParentComment((Comment)newValue);
				return;
			case IssuerPackage.COMMENT__AUTHOR:
				setAuthor((Developer)newValue);
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
			case IssuerPackage.COMMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case IssuerPackage.COMMENT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case IssuerPackage.COMMENT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case IssuerPackage.COMMENT__REPLIES:
				getReplies().clear();
				return;
			case IssuerPackage.COMMENT__REGARDING_ISSUE:
				setRegardingIssue((Issue)null);
				return;
			case IssuerPackage.COMMENT__PARENT_COMMENT:
				setParentComment((Comment)null);
				return;
			case IssuerPackage.COMMENT__AUTHOR:
				setAuthor((Developer)null);
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
			case IssuerPackage.COMMENT__ID:
				return id != ID_EDEFAULT;
			case IssuerPackage.COMMENT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case IssuerPackage.COMMENT__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case IssuerPackage.COMMENT__REPLIES:
				return replies != null && !replies.isEmpty();
			case IssuerPackage.COMMENT__REGARDING_ISSUE:
				return getRegardingIssue() != null;
			case IssuerPackage.COMMENT__PARENT_COMMENT:
				return getParentComment() != null;
			case IssuerPackage.COMMENT__AUTHOR:
				return author != null;
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
		result.append(", text: ");
		result.append(text);
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //CommentImpl
