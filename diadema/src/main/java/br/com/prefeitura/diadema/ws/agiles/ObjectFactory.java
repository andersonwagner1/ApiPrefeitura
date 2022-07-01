
package br.com.prefeitura.diadema.ws.agiles;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.prefeitura.diadema.ws.agiles package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
//@XmlRegistry
public class ObjectFactory {

    private final static QName _FindItemContainersByItemTypeResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findItemContainersByItemTypeResponse");
    private final static QName _SendEmailResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "sendEmailResponse");
    private final static QName _SendEmailWithAttachments_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "sendEmailWithAttachments");
    private final static QName _SendEmailForProcessWithAttachmentsResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "sendEmailForProcessWithAttachmentsResponse");
    private final static QName _CheckPermissionResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "checkPermissionResponse");
    private final static QName _GetItemResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getItemResponse");
    private final static QName _SendEmailWithAttachmentsResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "sendEmailWithAttachmentsResponse");
    private final static QName _SendEmailForProcessResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "sendEmailForProcessResponse");
    private final static QName _SendEmailForProcessWithAttachments_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "sendEmailForProcessWithAttachments");
    private final static QName _SetActive_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "setActive");
    private final static QName _GetItemName_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getItemName");
    private final static QName _ModifyItemResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "modifyItemResponse");
    private final static QName _GetItem_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getItem");
    private final static QName _CreateAuditTrailResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "createAuditTrailResponse");
    private final static QName _FindItemContainersByItemType_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findItemContainersByItemType");
    private final static QName _ModifyUserResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "modifyUserResponse");
    private final static QName _ModifyItem_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "modifyItem");
    private final static QName _AddToContainerResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "addToContainerResponse");
    private final static QName _GetItemNameResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getItemNameResponse");
    private final static QName _AddToContainer_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "addToContainer");
    private final static QName _SendEmailForProcess_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "sendEmailForProcess");
    private final static QName _CheckPermission_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "checkPermission");
    private final static QName _ModifyUser_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "modifyUser");
    private final static QName _SetActiveResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "setActiveResponse");
    private final static QName _CreateAuditTrail_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "createAuditTrail");
    private final static QName _SendEmail_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "sendEmail");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.prefeitura.diadema.ws.agiles
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModifyUserResponse }
     * 
     */
    public ModifyUserResponse createModifyUserResponse() {
        return new ModifyUserResponse();
    }

    /**
     * Create an instance of {@link ModifyItem }
     * 
     */
    public ModifyItem createModifyItem() {
        return new ModifyItem();
    }

    /**
     * Create an instance of {@link CreateAuditTrailResponse }
     * 
     */
    public CreateAuditTrailResponse createCreateAuditTrailResponse() {
        return new CreateAuditTrailResponse();
    }

    /**
     * Create an instance of {@link FindItemContainersByItemType }
     * 
     */
    public FindItemContainersByItemType createFindItemContainersByItemType() {
        return new FindItemContainersByItemType();
    }

    /**
     * Create an instance of {@link GetItem }
     * 
     */
    public GetItem createGetItem() {
        return new GetItem();
    }

    /**
     * Create an instance of {@link ModifyItemResponse }
     * 
     */
    public ModifyItemResponse createModifyItemResponse() {
        return new ModifyItemResponse();
    }

    /**
     * Create an instance of {@link CheckPermission }
     * 
     */
    public CheckPermission createCheckPermission() {
        return new CheckPermission();
    }

    /**
     * Create an instance of {@link ModifyUser }
     * 
     */
    public ModifyUser createModifyUser() {
        return new ModifyUser();
    }

    /**
     * Create an instance of {@link CreateAuditTrail }
     * 
     */
    public CreateAuditTrail createCreateAuditTrail() {
        return new CreateAuditTrail();
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link SetActiveResponse }
     * 
     */
    public SetActiveResponse createSetActiveResponse() {
        return new SetActiveResponse();
    }

    /**
     * Create an instance of {@link GetItemNameResponse }
     * 
     */
    public GetItemNameResponse createGetItemNameResponse() {
        return new GetItemNameResponse();
    }

    /**
     * Create an instance of {@link AddToContainerResponse }
     * 
     */
    public AddToContainerResponse createAddToContainerResponse() {
        return new AddToContainerResponse();
    }

    /**
     * Create an instance of {@link AddToContainer }
     * 
     */
    public AddToContainer createAddToContainer() {
        return new AddToContainer();
    }

    /**
     * Create an instance of {@link SendEmailForProcess }
     * 
     */
    public SendEmailForProcess createSendEmailForProcess() {
        return new SendEmailForProcess();
    }

    /**
     * Create an instance of {@link FindItemContainersByItemTypeResponse }
     * 
     */
    public FindItemContainersByItemTypeResponse createFindItemContainersByItemTypeResponse() {
        return new FindItemContainersByItemTypeResponse();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link SendEmailWithAttachments }
     * 
     */
    public SendEmailWithAttachments createSendEmailWithAttachments() {
        return new SendEmailWithAttachments();
    }

    /**
     * Create an instance of {@link SendEmailForProcessWithAttachments }
     * 
     */
    public SendEmailForProcessWithAttachments createSendEmailForProcessWithAttachments() {
        return new SendEmailForProcessWithAttachments();
    }

    /**
     * Create an instance of {@link SendEmailForProcessResponse }
     * 
     */
    public SendEmailForProcessResponse createSendEmailForProcessResponse() {
        return new SendEmailForProcessResponse();
    }

    /**
     * Create an instance of {@link GetItemName }
     * 
     */
    public GetItemName createGetItemName() {
        return new GetItemName();
    }

    /**
     * Create an instance of {@link SetActive }
     * 
     */
    public SetActive createSetActive() {
        return new SetActive();
    }

    /**
     * Create an instance of {@link GetItemResponse }
     * 
     */
    public GetItemResponse createGetItemResponse() {
        return new GetItemResponse();
    }

    /**
     * Create an instance of {@link SendEmailWithAttachmentsResponse }
     * 
     */
    public SendEmailWithAttachmentsResponse createSendEmailWithAttachmentsResponse() {
        return new SendEmailWithAttachmentsResponse();
    }

    /**
     * Create an instance of {@link SendEmailForProcessWithAttachmentsResponse }
     * 
     */
    public SendEmailForProcessWithAttachmentsResponse createSendEmailForProcessWithAttachmentsResponse() {
        return new SendEmailForProcessWithAttachmentsResponse();
    }

    /**
     * Create an instance of {@link CheckPermissionResponse }
     * 
     */
    public CheckPermissionResponse createCheckPermissionResponse() {
        return new CheckPermissionResponse();
    }

    /**
     * Create an instance of {@link AgilesItem }
     * 
     */
    public AgilesItem createAgilesItem() {
        return new AgilesItem();
    }

    /**
     * Create an instance of {@link AgilesUser }
     * 
     */
    public AgilesUser createAgilesUser() {
        return new AgilesUser();
    }

    /**
     * Create an instance of {@link HashMap }
     * 
     */
    public HashMap createHashMap() {
        return new HashMap();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindItemContainersByItemTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findItemContainersByItemTypeResponse")
    public JAXBElement<FindItemContainersByItemTypeResponse> createFindItemContainersByItemTypeResponse(FindItemContainersByItemTypeResponse value) {
        return new JAXBElement<FindItemContainersByItemTypeResponse>(_FindItemContainersByItemTypeResponse_QNAME, FindItemContainersByItemTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "sendEmailResponse")
    public JAXBElement<SendEmailResponse> createSendEmailResponse(SendEmailResponse value) {
        return new JAXBElement<SendEmailResponse>(_SendEmailResponse_QNAME, SendEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailWithAttachments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "sendEmailWithAttachments")
    public JAXBElement<SendEmailWithAttachments> createSendEmailWithAttachments(SendEmailWithAttachments value) {
        return new JAXBElement<SendEmailWithAttachments>(_SendEmailWithAttachments_QNAME, SendEmailWithAttachments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailForProcessWithAttachmentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "sendEmailForProcessWithAttachmentsResponse")
    public JAXBElement<SendEmailForProcessWithAttachmentsResponse> createSendEmailForProcessWithAttachmentsResponse(SendEmailForProcessWithAttachmentsResponse value) {
        return new JAXBElement<SendEmailForProcessWithAttachmentsResponse>(_SendEmailForProcessWithAttachmentsResponse_QNAME, SendEmailForProcessWithAttachmentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPermissionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "checkPermissionResponse")
    public JAXBElement<CheckPermissionResponse> createCheckPermissionResponse(CheckPermissionResponse value) {
        return new JAXBElement<CheckPermissionResponse>(_CheckPermissionResponse_QNAME, CheckPermissionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getItemResponse")
    public JAXBElement<GetItemResponse> createGetItemResponse(GetItemResponse value) {
        return new JAXBElement<GetItemResponse>(_GetItemResponse_QNAME, GetItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailWithAttachmentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "sendEmailWithAttachmentsResponse")
    public JAXBElement<SendEmailWithAttachmentsResponse> createSendEmailWithAttachmentsResponse(SendEmailWithAttachmentsResponse value) {
        return new JAXBElement<SendEmailWithAttachmentsResponse>(_SendEmailWithAttachmentsResponse_QNAME, SendEmailWithAttachmentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailForProcessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "sendEmailForProcessResponse")
    public JAXBElement<SendEmailForProcessResponse> createSendEmailForProcessResponse(SendEmailForProcessResponse value) {
        return new JAXBElement<SendEmailForProcessResponse>(_SendEmailForProcessResponse_QNAME, SendEmailForProcessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailForProcessWithAttachments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "sendEmailForProcessWithAttachments")
    public JAXBElement<SendEmailForProcessWithAttachments> createSendEmailForProcessWithAttachments(SendEmailForProcessWithAttachments value) {
        return new JAXBElement<SendEmailForProcessWithAttachments>(_SendEmailForProcessWithAttachments_QNAME, SendEmailForProcessWithAttachments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetActive }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "setActive")
    public JAXBElement<SetActive> createSetActive(SetActive value) {
        return new JAXBElement<SetActive>(_SetActive_QNAME, SetActive.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getItemName")
    public JAXBElement<GetItemName> createGetItemName(GetItemName value) {
        return new JAXBElement<GetItemName>(_GetItemName_QNAME, GetItemName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "modifyItemResponse")
    public JAXBElement<ModifyItemResponse> createModifyItemResponse(ModifyItemResponse value) {
        return new JAXBElement<ModifyItemResponse>(_ModifyItemResponse_QNAME, ModifyItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getItem")
    public JAXBElement<GetItem> createGetItem(GetItem value) {
        return new JAXBElement<GetItem>(_GetItem_QNAME, GetItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAuditTrailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "createAuditTrailResponse")
    public JAXBElement<CreateAuditTrailResponse> createCreateAuditTrailResponse(CreateAuditTrailResponse value) {
        return new JAXBElement<CreateAuditTrailResponse>(_CreateAuditTrailResponse_QNAME, CreateAuditTrailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindItemContainersByItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findItemContainersByItemType")
    public JAXBElement<FindItemContainersByItemType> createFindItemContainersByItemType(FindItemContainersByItemType value) {
        return new JAXBElement<FindItemContainersByItemType>(_FindItemContainersByItemType_QNAME, FindItemContainersByItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "modifyUserResponse")
    public JAXBElement<ModifyUserResponse> createModifyUserResponse(ModifyUserResponse value) {
        return new JAXBElement<ModifyUserResponse>(_ModifyUserResponse_QNAME, ModifyUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "modifyItem")
    public JAXBElement<ModifyItem> createModifyItem(ModifyItem value) {
        return new JAXBElement<ModifyItem>(_ModifyItem_QNAME, ModifyItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddToContainerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "addToContainerResponse")
    public JAXBElement<AddToContainerResponse> createAddToContainerResponse(AddToContainerResponse value) {
        return new JAXBElement<AddToContainerResponse>(_AddToContainerResponse_QNAME, AddToContainerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getItemNameResponse")
    public JAXBElement<GetItemNameResponse> createGetItemNameResponse(GetItemNameResponse value) {
        return new JAXBElement<GetItemNameResponse>(_GetItemNameResponse_QNAME, GetItemNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddToContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "addToContainer")
    public JAXBElement<AddToContainer> createAddToContainer(AddToContainer value) {
        return new JAXBElement<AddToContainer>(_AddToContainer_QNAME, AddToContainer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailForProcess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "sendEmailForProcess")
    public JAXBElement<SendEmailForProcess> createSendEmailForProcess(SendEmailForProcess value) {
        return new JAXBElement<SendEmailForProcess>(_SendEmailForProcess_QNAME, SendEmailForProcess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPermission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "checkPermission")
    public JAXBElement<CheckPermission> createCheckPermission(CheckPermission value) {
        return new JAXBElement<CheckPermission>(_CheckPermission_QNAME, CheckPermission.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "modifyUser")
    public JAXBElement<ModifyUser> createModifyUser(ModifyUser value) {
        return new JAXBElement<ModifyUser>(_ModifyUser_QNAME, ModifyUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetActiveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "setActiveResponse")
    public JAXBElement<SetActiveResponse> createSetActiveResponse(SetActiveResponse value) {
        return new JAXBElement<SetActiveResponse>(_SetActiveResponse_QNAME, SetActiveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAuditTrail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "createAuditTrail")
    public JAXBElement<CreateAuditTrail> createCreateAuditTrail(CreateAuditTrail value) {
        return new JAXBElement<CreateAuditTrail>(_CreateAuditTrail_QNAME, CreateAuditTrail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "sendEmail")
    public JAXBElement<SendEmail> createSendEmail(SendEmail value) {
        return new JAXBElement<SendEmail>(_SendEmail_QNAME, SendEmail.class, null, value);
    }

}
