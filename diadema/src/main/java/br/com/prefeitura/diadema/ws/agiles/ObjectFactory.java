
package br.com.prefeitura.diadema.ws.agiles;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.diadema.ws.agiles package. 
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
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindLevelByDimentionAndLevelName_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findLevelByDimentionAndLevelName");
    private final static QName _FindParentLevel_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findParentLevel");
    private final static QName _FindLevelsByName_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findLevelsByName");
    private final static QName _GetUsersFromGroup_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getUsersFromGroup");
    private final static QName _CreateLevel_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "createLevel");
    private final static QName _FindExactNodesByLevelPKs_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findExactNodesByLevelPKs");
    private final static QName _CreateUserResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "createUserResponse");
    private final static QName _GetGroupByName_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getGroupByName");
    private final static QName _GetNodeByLevelsResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getNodeByLevelsResponse");
    private final static QName _GetUserByPk_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getUserByPk");
    private final static QName _FindNodesByLevels_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findNodesByLevels");
    private final static QName _FindNodesByLevelsResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findNodesByLevelsResponse");
    private final static QName _FindUsersByNameResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findUsersByNameResponse");
    private final static QName _FindGroupsByName_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findGroupsByName");
    private final static QName _FindBasicNodesContaining_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findBasicNodesContaining");
    private final static QName _CreateGroupResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "createGroupResponse");
    private final static QName _FindDimensionNameByLevelNameResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findDimensionNameByLevelNameResponse");
    private final static QName _AddUserToGroup_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "addUserToGroup");
    private final static QName _CreateUser_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "createUser");
    private final static QName _AddUserToOrganizationalNodeResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "addUserToOrganizationalNodeResponse");
    private final static QName _AddUserToGroupResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "addUserToGroupResponse");
    private final static QName _FindChildrenLevelsResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findChildrenLevelsResponse");
    private final static QName _CreateOrganizationalNodeResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "createOrganizationalNodeResponse");
    private final static QName _CreateLevelInParentLevelResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "createLevelInParentLevelResponse");
    private final static QName _FindNodeByLevels_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findNodeByLevels");
    private final static QName _GetNodeByLevels_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getNodeByLevels");
    private final static QName _FindExactNodesByLevelPKsResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findExactNodesByLevelPKsResponse");
    private final static QName _ModifyUserResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "modifyUserResponse");
    private final static QName _FindLevelNameByUserAndDimensionResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findLevelNameByUserAndDimensionResponse");
    private final static QName _FindGroupsByNameResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findGroupsByNameResponse");
    private final static QName _FindLevelNamesByUserAndDimensionResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findLevelNamesByUserAndDimensionResponse");
    private final static QName _FindUsersByDimentionAndLevelName_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findUsersByDimentionAndLevelName");
    private final static QName _FindChildrenLevels_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findChildrenLevels");
    private final static QName _FindGroupsContaining_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findGroupsContaining");
    private final static QName _GetNodesByLevels_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getNodesByLevels");
    private final static QName _ResetUserPasswordAndSendEmailResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "resetUserPasswordAndSendEmailResponse");
    private final static QName _FindUsersByDimentionAndLevelNameResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findUsersByDimentionAndLevelNameResponse");
    private final static QName _FindLevelNamesByDimensionNameResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findLevelNamesByDimensionNameResponse");
    private final static QName _CreateLevelResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "createLevelResponse");
    private final static QName _GetUsersFromGroupResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getUsersFromGroupResponse");
    private final static QName _GetNodeByPkResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getNodeByPkResponse");
    private final static QName _GetActivityAssignee_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getActivityAssignee");
    private final static QName _ChangeUserPassword_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "changeUserPassword");
    private final static QName _CreateGroup_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "createGroup");
    private final static QName _FindLevelNameByUserAndDimension_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findLevelNameByUserAndDimension");
    private final static QName _CreateLevelInParentLevel_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "createLevelInParentLevel");
    private final static QName _AddUserToOrganizationalNode_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "addUserToOrganizationalNode");
    private final static QName _FindParentLevelResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findParentLevelResponse");
    private final static QName _ResetUserPasswordAndSendEmail_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "resetUserPasswordAndSendEmail");
    private final static QName _FindBasicNodesContainingResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findBasicNodesContainingResponse");
    private final static QName _FindGroupsContainingResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findGroupsContainingResponse");
    private final static QName _GetUserPksFromParticipantResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getUserPksFromParticipantResponse");
    private final static QName _FindActiveUserByLogin_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findActiveUserByLogin");
    private final static QName _GetGroupByNameResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getGroupByNameResponse");
    private final static QName _FindLevelNamesByDimensionName_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findLevelNamesByDimensionName");
    private final static QName _CreateOrganizationalNode_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "createOrganizationalNode");
    private final static QName _FindNodesContainingResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findNodesContainingResponse");
    private final static QName _GetNodeByPk_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getNodeByPk");
    private final static QName _GetUserByPkResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getUserByPkResponse");
    private final static QName _GetUserPksFromParticipant_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getUserPksFromParticipant");
    private final static QName _GetUsersFromParticipantResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getUsersFromParticipantResponse");
    private final static QName _FindLevelsByNameResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findLevelsByNameResponse");
    private final static QName _FindNodeByLevelsResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findNodeByLevelsResponse");
    private final static QName _GetActivityAssigneeResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getActivityAssigneeResponse");
    private final static QName _GetNodesByLevelsResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getNodesByLevelsResponse");
    private final static QName _FindLevelNamesByUserAndDimension_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findLevelNamesByUserAndDimension");
    private final static QName _FindDimensionNameByLevelName_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findDimensionNameByLevelName");
    private final static QName _FindNodesContaining_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findNodesContaining");
    private final static QName _ChangeUserPasswordResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "changeUserPasswordResponse");
    private final static QName _FindLevelByDimentionAndLevelNameResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findLevelByDimentionAndLevelNameResponse");
    private final static QName _ModifyUser_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "modifyUser");
    private final static QName _FindActiveUserByLoginResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findActiveUserByLoginResponse");
    private final static QName _FindNodesByNameResponse_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findNodesByNameResponse");
    private final static QName _FindUsersByName_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findUsersByName");
    private final static QName _GetUsersFromParticipant_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "getUsersFromParticipant");
    private final static QName _FindNodesByName_QNAME = new QName("http://imagetechnology.com.br/agiles_services", "findNodesByName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.diadema.ws.agiles
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindLevelsByNameResponse }
     * 
     */
    public FindLevelsByNameResponse createFindLevelsByNameResponse() {
        return new FindLevelsByNameResponse();
    }

    /**
     * Create an instance of {@link GetUserPksFromParticipant }
     * 
     */
    public GetUserPksFromParticipant createGetUserPksFromParticipant() {
        return new GetUserPksFromParticipant();
    }

    /**
     * Create an instance of {@link GetUserByPkResponse }
     * 
     */
    public GetUserByPkResponse createGetUserByPkResponse() {
        return new GetUserByPkResponse();
    }

    /**
     * Create an instance of {@link GetUsersFromParticipantResponse }
     * 
     */
    public GetUsersFromParticipantResponse createGetUsersFromParticipantResponse() {
        return new GetUsersFromParticipantResponse();
    }

    /**
     * Create an instance of {@link GetNodeByPk }
     * 
     */
    public GetNodeByPk createGetNodeByPk() {
        return new GetNodeByPk();
    }

    /**
     * Create an instance of {@link FindLevelNamesByDimensionName }
     * 
     */
    public FindLevelNamesByDimensionName createFindLevelNamesByDimensionName() {
        return new FindLevelNamesByDimensionName();
    }

    /**
     * Create an instance of {@link FindNodesContainingResponse }
     * 
     */
    public FindNodesContainingResponse createFindNodesContainingResponse() {
        return new FindNodesContainingResponse();
    }

    /**
     * Create an instance of {@link CreateOrganizationalNode }
     * 
     */
    public CreateOrganizationalNode createCreateOrganizationalNode() {
        return new CreateOrganizationalNode();
    }

    /**
     * Create an instance of {@link FindActiveUserByLoginResponse }
     * 
     */
    public FindActiveUserByLoginResponse createFindActiveUserByLoginResponse() {
        return new FindActiveUserByLoginResponse();
    }

    /**
     * Create an instance of {@link FindNodesByNameResponse }
     * 
     */
    public FindNodesByNameResponse createFindNodesByNameResponse() {
        return new FindNodesByNameResponse();
    }

    /**
     * Create an instance of {@link ChangeUserPasswordResponse }
     * 
     */
    public ChangeUserPasswordResponse createChangeUserPasswordResponse() {
        return new ChangeUserPasswordResponse();
    }

    /**
     * Create an instance of {@link FindLevelByDimentionAndLevelNameResponse }
     * 
     */
    public FindLevelByDimentionAndLevelNameResponse createFindLevelByDimentionAndLevelNameResponse() {
        return new FindLevelByDimentionAndLevelNameResponse();
    }

    /**
     * Create an instance of {@link ModifyUser }
     * 
     */
    public ModifyUser createModifyUser() {
        return new ModifyUser();
    }

    /**
     * Create an instance of {@link FindNodesByName }
     * 
     */
    public FindNodesByName createFindNodesByName() {
        return new FindNodesByName();
    }

    /**
     * Create an instance of {@link FindUsersByName }
     * 
     */
    public FindUsersByName createFindUsersByName() {
        return new FindUsersByName();
    }

    /**
     * Create an instance of {@link GetUsersFromParticipant }
     * 
     */
    public GetUsersFromParticipant createGetUsersFromParticipant() {
        return new GetUsersFromParticipant();
    }

    /**
     * Create an instance of {@link FindNodesContaining }
     * 
     */
    public FindNodesContaining createFindNodesContaining() {
        return new FindNodesContaining();
    }

    /**
     * Create an instance of {@link FindDimensionNameByLevelName }
     * 
     */
    public FindDimensionNameByLevelName createFindDimensionNameByLevelName() {
        return new FindDimensionNameByLevelName();
    }

    /**
     * Create an instance of {@link GetActivityAssigneeResponse }
     * 
     */
    public GetActivityAssigneeResponse createGetActivityAssigneeResponse() {
        return new GetActivityAssigneeResponse();
    }

    /**
     * Create an instance of {@link GetNodesByLevelsResponse }
     * 
     */
    public GetNodesByLevelsResponse createGetNodesByLevelsResponse() {
        return new GetNodesByLevelsResponse();
    }

    /**
     * Create an instance of {@link FindNodeByLevelsResponse }
     * 
     */
    public FindNodeByLevelsResponse createFindNodeByLevelsResponse() {
        return new FindNodeByLevelsResponse();
    }

    /**
     * Create an instance of {@link FindLevelNamesByUserAndDimension }
     * 
     */
    public FindLevelNamesByUserAndDimension createFindLevelNamesByUserAndDimension() {
        return new FindLevelNamesByUserAndDimension();
    }

    /**
     * Create an instance of {@link ChangeUserPassword }
     * 
     */
    public ChangeUserPassword createChangeUserPassword() {
        return new ChangeUserPassword();
    }

    /**
     * Create an instance of {@link CreateGroup }
     * 
     */
    public CreateGroup createCreateGroup() {
        return new CreateGroup();
    }

    /**
     * Create an instance of {@link GetActivityAssignee }
     * 
     */
    public GetActivityAssignee createGetActivityAssignee() {
        return new GetActivityAssignee();
    }

    /**
     * Create an instance of {@link CreateLevelResponse }
     * 
     */
    public CreateLevelResponse createCreateLevelResponse() {
        return new CreateLevelResponse();
    }

    /**
     * Create an instance of {@link GetUsersFromGroupResponse }
     * 
     */
    public GetUsersFromGroupResponse createGetUsersFromGroupResponse() {
        return new GetUsersFromGroupResponse();
    }

    /**
     * Create an instance of {@link GetNodeByPkResponse }
     * 
     */
    public GetNodeByPkResponse createGetNodeByPkResponse() {
        return new GetNodeByPkResponse();
    }

    /**
     * Create an instance of {@link FindLevelNamesByDimensionNameResponse }
     * 
     */
    public FindLevelNamesByDimensionNameResponse createFindLevelNamesByDimensionNameResponse() {
        return new FindLevelNamesByDimensionNameResponse();
    }

    /**
     * Create an instance of {@link FindActiveUserByLogin }
     * 
     */
    public FindActiveUserByLogin createFindActiveUserByLogin() {
        return new FindActiveUserByLogin();
    }

    /**
     * Create an instance of {@link GetGroupByNameResponse }
     * 
     */
    public GetGroupByNameResponse createGetGroupByNameResponse() {
        return new GetGroupByNameResponse();
    }

    /**
     * Create an instance of {@link FindBasicNodesContainingResponse }
     * 
     */
    public FindBasicNodesContainingResponse createFindBasicNodesContainingResponse() {
        return new FindBasicNodesContainingResponse();
    }

    /**
     * Create an instance of {@link FindGroupsContainingResponse }
     * 
     */
    public FindGroupsContainingResponse createFindGroupsContainingResponse() {
        return new FindGroupsContainingResponse();
    }

    /**
     * Create an instance of {@link GetUserPksFromParticipantResponse }
     * 
     */
    public GetUserPksFromParticipantResponse createGetUserPksFromParticipantResponse() {
        return new GetUserPksFromParticipantResponse();
    }

    /**
     * Create an instance of {@link AddUserToOrganizationalNode }
     * 
     */
    public AddUserToOrganizationalNode createAddUserToOrganizationalNode() {
        return new AddUserToOrganizationalNode();
    }

    /**
     * Create an instance of {@link FindParentLevelResponse }
     * 
     */
    public FindParentLevelResponse createFindParentLevelResponse() {
        return new FindParentLevelResponse();
    }

    /**
     * Create an instance of {@link ResetUserPasswordAndSendEmail }
     * 
     */
    public ResetUserPasswordAndSendEmail createResetUserPasswordAndSendEmail() {
        return new ResetUserPasswordAndSendEmail();
    }

    /**
     * Create an instance of {@link FindLevelNameByUserAndDimension }
     * 
     */
    public FindLevelNameByUserAndDimension createFindLevelNameByUserAndDimension() {
        return new FindLevelNameByUserAndDimension();
    }

    /**
     * Create an instance of {@link CreateLevelInParentLevel }
     * 
     */
    public CreateLevelInParentLevel createCreateLevelInParentLevel() {
        return new CreateLevelInParentLevel();
    }

    /**
     * Create an instance of {@link FindExactNodesByLevelPKsResponse }
     * 
     */
    public FindExactNodesByLevelPKsResponse createFindExactNodesByLevelPKsResponse() {
        return new FindExactNodesByLevelPKsResponse();
    }

    /**
     * Create an instance of {@link ModifyUserResponse }
     * 
     */
    public ModifyUserResponse createModifyUserResponse() {
        return new ModifyUserResponse();
    }

    /**
     * Create an instance of {@link FindLevelNameByUserAndDimensionResponse }
     * 
     */
    public FindLevelNameByUserAndDimensionResponse createFindLevelNameByUserAndDimensionResponse() {
        return new FindLevelNameByUserAndDimensionResponse();
    }

    /**
     * Create an instance of {@link CreateLevelInParentLevelResponse }
     * 
     */
    public CreateLevelInParentLevelResponse createCreateLevelInParentLevelResponse() {
        return new CreateLevelInParentLevelResponse();
    }

    /**
     * Create an instance of {@link FindNodeByLevels }
     * 
     */
    public FindNodeByLevels createFindNodeByLevels() {
        return new FindNodeByLevels();
    }

    /**
     * Create an instance of {@link GetNodeByLevels }
     * 
     */
    public GetNodeByLevels createGetNodeByLevels() {
        return new GetNodeByLevels();
    }

    /**
     * Create an instance of {@link CreateOrganizationalNodeResponse }
     * 
     */
    public CreateOrganizationalNodeResponse createCreateOrganizationalNodeResponse() {
        return new CreateOrganizationalNodeResponse();
    }

    /**
     * Create an instance of {@link ResetUserPasswordAndSendEmailResponse }
     * 
     */
    public ResetUserPasswordAndSendEmailResponse createResetUserPasswordAndSendEmailResponse() {
        return new ResetUserPasswordAndSendEmailResponse();
    }

    /**
     * Create an instance of {@link FindUsersByDimentionAndLevelNameResponse }
     * 
     */
    public FindUsersByDimentionAndLevelNameResponse createFindUsersByDimentionAndLevelNameResponse() {
        return new FindUsersByDimentionAndLevelNameResponse();
    }

    /**
     * Create an instance of {@link FindChildrenLevels }
     * 
     */
    public FindChildrenLevels createFindChildrenLevels() {
        return new FindChildrenLevels();
    }

    /**
     * Create an instance of {@link FindGroupsContaining }
     * 
     */
    public FindGroupsContaining createFindGroupsContaining() {
        return new FindGroupsContaining();
    }

    /**
     * Create an instance of {@link GetNodesByLevels }
     * 
     */
    public GetNodesByLevels createGetNodesByLevels() {
        return new GetNodesByLevels();
    }

    /**
     * Create an instance of {@link FindUsersByDimentionAndLevelName }
     * 
     */
    public FindUsersByDimentionAndLevelName createFindUsersByDimentionAndLevelName() {
        return new FindUsersByDimentionAndLevelName();
    }

    /**
     * Create an instance of {@link FindGroupsByNameResponse }
     * 
     */
    public FindGroupsByNameResponse createFindGroupsByNameResponse() {
        return new FindGroupsByNameResponse();
    }

    /**
     * Create an instance of {@link FindLevelNamesByUserAndDimensionResponse }
     * 
     */
    public FindLevelNamesByUserAndDimensionResponse createFindLevelNamesByUserAndDimensionResponse() {
        return new FindLevelNamesByUserAndDimensionResponse();
    }

    /**
     * Create an instance of {@link GetUserByPk }
     * 
     */
    public GetUserByPk createGetUserByPk() {
        return new GetUserByPk();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link FindExactNodesByLevelPKs }
     * 
     */
    public FindExactNodesByLevelPKs createFindExactNodesByLevelPKs() {
        return new FindExactNodesByLevelPKs();
    }

    /**
     * Create an instance of {@link GetGroupByName }
     * 
     */
    public GetGroupByName createGetGroupByName() {
        return new GetGroupByName();
    }

    /**
     * Create an instance of {@link GetNodeByLevelsResponse }
     * 
     */
    public GetNodeByLevelsResponse createGetNodeByLevelsResponse() {
        return new GetNodeByLevelsResponse();
    }

    /**
     * Create an instance of {@link FindLevelsByName }
     * 
     */
    public FindLevelsByName createFindLevelsByName() {
        return new FindLevelsByName();
    }

    /**
     * Create an instance of {@link GetUsersFromGroup }
     * 
     */
    public GetUsersFromGroup createGetUsersFromGroup() {
        return new GetUsersFromGroup();
    }

    /**
     * Create an instance of {@link CreateLevel }
     * 
     */
    public CreateLevel createCreateLevel() {
        return new CreateLevel();
    }

    /**
     * Create an instance of {@link FindLevelByDimentionAndLevelName }
     * 
     */
    public FindLevelByDimentionAndLevelName createFindLevelByDimentionAndLevelName() {
        return new FindLevelByDimentionAndLevelName();
    }

    /**
     * Create an instance of {@link FindParentLevel }
     * 
     */
    public FindParentLevel createFindParentLevel() {
        return new FindParentLevel();
    }

    /**
     * Create an instance of {@link AddUserToGroupResponse }
     * 
     */
    public AddUserToGroupResponse createAddUserToGroupResponse() {
        return new AddUserToGroupResponse();
    }

    /**
     * Create an instance of {@link FindChildrenLevelsResponse }
     * 
     */
    public FindChildrenLevelsResponse createFindChildrenLevelsResponse() {
        return new FindChildrenLevelsResponse();
    }

    /**
     * Create an instance of {@link AddUserToOrganizationalNodeResponse }
     * 
     */
    public AddUserToOrganizationalNodeResponse createAddUserToOrganizationalNodeResponse() {
        return new AddUserToOrganizationalNodeResponse();
    }

    /**
     * Create an instance of {@link FindBasicNodesContaining }
     * 
     */
    public FindBasicNodesContaining createFindBasicNodesContaining() {
        return new FindBasicNodesContaining();
    }

    /**
     * Create an instance of {@link AddUserToGroup }
     * 
     */
    public AddUserToGroup createAddUserToGroup() {
        return new AddUserToGroup();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link CreateGroupResponse }
     * 
     */
    public CreateGroupResponse createCreateGroupResponse() {
        return new CreateGroupResponse();
    }

    /**
     * Create an instance of {@link FindDimensionNameByLevelNameResponse }
     * 
     */
    public FindDimensionNameByLevelNameResponse createFindDimensionNameByLevelNameResponse() {
        return new FindDimensionNameByLevelNameResponse();
    }

    /**
     * Create an instance of {@link FindNodesByLevels }
     * 
     */
    public FindNodesByLevels createFindNodesByLevels() {
        return new FindNodesByLevels();
    }

    /**
     * Create an instance of {@link FindNodesByLevelsResponse }
     * 
     */
    public FindNodesByLevelsResponse createFindNodesByLevelsResponse() {
        return new FindNodesByLevelsResponse();
    }

    /**
     * Create an instance of {@link FindGroupsByName }
     * 
     */
    public FindGroupsByName createFindGroupsByName() {
        return new FindGroupsByName();
    }

    /**
     * Create an instance of {@link FindUsersByNameResponse }
     * 
     */
    public FindUsersByNameResponse createFindUsersByNameResponse() {
        return new FindUsersByNameResponse();
    }

    /**
     * Create an instance of {@link AgilesUser }
     * 
     */
    public AgilesUser createAgilesUser() {
        return new AgilesUser();
    }

    /**
     * Create an instance of {@link LevelDimensionPair }
     * 
     */
    public LevelDimensionPair createLevelDimensionPair() {
        return new LevelDimensionPair();
    }

    /**
     * Create an instance of {@link AgilesOrganizationalLevel }
     * 
     */
    public AgilesOrganizationalLevel createAgilesOrganizationalLevel() {
        return new AgilesOrganizationalLevel();
    }

    /**
     * Create an instance of {@link AgilesItem }
     * 
     */
    public AgilesItem createAgilesItem() {
        return new AgilesItem();
    }

    /**
     * Create an instance of {@link AgilesOrganizationalDimension }
     * 
     */
    public AgilesOrganizationalDimension createAgilesOrganizationalDimension() {
        return new AgilesOrganizationalDimension();
    }

    /**
     * Create an instance of {@link AgilesOrganizationalNode }
     * 
     */
    public AgilesOrganizationalNode createAgilesOrganizationalNode() {
        return new AgilesOrganizationalNode();
    }

    /**
     * Create an instance of {@link AgilesGroup }
     * 
     */
    public AgilesGroup createAgilesGroup() {
        return new AgilesGroup();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLevelByDimentionAndLevelName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findLevelByDimentionAndLevelName")
    public JAXBElement<FindLevelByDimentionAndLevelName> createFindLevelByDimentionAndLevelName(FindLevelByDimentionAndLevelName value) {
        return new JAXBElement<FindLevelByDimentionAndLevelName>(_FindLevelByDimentionAndLevelName_QNAME, FindLevelByDimentionAndLevelName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindParentLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findParentLevel")
    public JAXBElement<FindParentLevel> createFindParentLevel(FindParentLevel value) {
        return new JAXBElement<FindParentLevel>(_FindParentLevel_QNAME, FindParentLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLevelsByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findLevelsByName")
    public JAXBElement<FindLevelsByName> createFindLevelsByName(FindLevelsByName value) {
        return new JAXBElement<FindLevelsByName>(_FindLevelsByName_QNAME, FindLevelsByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersFromGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getUsersFromGroup")
    public JAXBElement<GetUsersFromGroup> createGetUsersFromGroup(GetUsersFromGroup value) {
        return new JAXBElement<GetUsersFromGroup>(_GetUsersFromGroup_QNAME, GetUsersFromGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "createLevel")
    public JAXBElement<CreateLevel> createCreateLevel(CreateLevel value) {
        return new JAXBElement<CreateLevel>(_CreateLevel_QNAME, CreateLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindExactNodesByLevelPKs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findExactNodesByLevelPKs")
    public JAXBElement<FindExactNodesByLevelPKs> createFindExactNodesByLevelPKs(FindExactNodesByLevelPKs value) {
        return new JAXBElement<FindExactNodesByLevelPKs>(_FindExactNodesByLevelPKs_QNAME, FindExactNodesByLevelPKs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGroupByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getGroupByName")
    public JAXBElement<GetGroupByName> createGetGroupByName(GetGroupByName value) {
        return new JAXBElement<GetGroupByName>(_GetGroupByName_QNAME, GetGroupByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNodeByLevelsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getNodeByLevelsResponse")
    public JAXBElement<GetNodeByLevelsResponse> createGetNodeByLevelsResponse(GetNodeByLevelsResponse value) {
        return new JAXBElement<GetNodeByLevelsResponse>(_GetNodeByLevelsResponse_QNAME, GetNodeByLevelsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByPk }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getUserByPk")
    public JAXBElement<GetUserByPk> createGetUserByPk(GetUserByPk value) {
        return new JAXBElement<GetUserByPk>(_GetUserByPk_QNAME, GetUserByPk.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindNodesByLevels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findNodesByLevels")
    public JAXBElement<FindNodesByLevels> createFindNodesByLevels(FindNodesByLevels value) {
        return new JAXBElement<FindNodesByLevels>(_FindNodesByLevels_QNAME, FindNodesByLevels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindNodesByLevelsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findNodesByLevelsResponse")
    public JAXBElement<FindNodesByLevelsResponse> createFindNodesByLevelsResponse(FindNodesByLevelsResponse value) {
        return new JAXBElement<FindNodesByLevelsResponse>(_FindNodesByLevelsResponse_QNAME, FindNodesByLevelsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUsersByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findUsersByNameResponse")
    public JAXBElement<FindUsersByNameResponse> createFindUsersByNameResponse(FindUsersByNameResponse value) {
        return new JAXBElement<FindUsersByNameResponse>(_FindUsersByNameResponse_QNAME, FindUsersByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindGroupsByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findGroupsByName")
    public JAXBElement<FindGroupsByName> createFindGroupsByName(FindGroupsByName value) {
        return new JAXBElement<FindGroupsByName>(_FindGroupsByName_QNAME, FindGroupsByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBasicNodesContaining }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findBasicNodesContaining")
    public JAXBElement<FindBasicNodesContaining> createFindBasicNodesContaining(FindBasicNodesContaining value) {
        return new JAXBElement<FindBasicNodesContaining>(_FindBasicNodesContaining_QNAME, FindBasicNodesContaining.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGroupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "createGroupResponse")
    public JAXBElement<CreateGroupResponse> createCreateGroupResponse(CreateGroupResponse value) {
        return new JAXBElement<CreateGroupResponse>(_CreateGroupResponse_QNAME, CreateGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDimensionNameByLevelNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findDimensionNameByLevelNameResponse")
    public JAXBElement<FindDimensionNameByLevelNameResponse> createFindDimensionNameByLevelNameResponse(FindDimensionNameByLevelNameResponse value) {
        return new JAXBElement<FindDimensionNameByLevelNameResponse>(_FindDimensionNameByLevelNameResponse_QNAME, FindDimensionNameByLevelNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserToGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "addUserToGroup")
    public JAXBElement<AddUserToGroup> createAddUserToGroup(AddUserToGroup value) {
        return new JAXBElement<AddUserToGroup>(_AddUserToGroup_QNAME, AddUserToGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserToOrganizationalNodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "addUserToOrganizationalNodeResponse")
    public JAXBElement<AddUserToOrganizationalNodeResponse> createAddUserToOrganizationalNodeResponse(AddUserToOrganizationalNodeResponse value) {
        return new JAXBElement<AddUserToOrganizationalNodeResponse>(_AddUserToOrganizationalNodeResponse_QNAME, AddUserToOrganizationalNodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserToGroupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "addUserToGroupResponse")
    public JAXBElement<AddUserToGroupResponse> createAddUserToGroupResponse(AddUserToGroupResponse value) {
        return new JAXBElement<AddUserToGroupResponse>(_AddUserToGroupResponse_QNAME, AddUserToGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindChildrenLevelsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findChildrenLevelsResponse")
    public JAXBElement<FindChildrenLevelsResponse> createFindChildrenLevelsResponse(FindChildrenLevelsResponse value) {
        return new JAXBElement<FindChildrenLevelsResponse>(_FindChildrenLevelsResponse_QNAME, FindChildrenLevelsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrganizationalNodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "createOrganizationalNodeResponse")
    public JAXBElement<CreateOrganizationalNodeResponse> createCreateOrganizationalNodeResponse(CreateOrganizationalNodeResponse value) {
        return new JAXBElement<CreateOrganizationalNodeResponse>(_CreateOrganizationalNodeResponse_QNAME, CreateOrganizationalNodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateLevelInParentLevelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "createLevelInParentLevelResponse")
    public JAXBElement<CreateLevelInParentLevelResponse> createCreateLevelInParentLevelResponse(CreateLevelInParentLevelResponse value) {
        return new JAXBElement<CreateLevelInParentLevelResponse>(_CreateLevelInParentLevelResponse_QNAME, CreateLevelInParentLevelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindNodeByLevels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findNodeByLevels")
    public JAXBElement<FindNodeByLevels> createFindNodeByLevels(FindNodeByLevels value) {
        return new JAXBElement<FindNodeByLevels>(_FindNodeByLevels_QNAME, FindNodeByLevels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNodeByLevels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getNodeByLevels")
    public JAXBElement<GetNodeByLevels> createGetNodeByLevels(GetNodeByLevels value) {
        return new JAXBElement<GetNodeByLevels>(_GetNodeByLevels_QNAME, GetNodeByLevels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindExactNodesByLevelPKsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findExactNodesByLevelPKsResponse")
    public JAXBElement<FindExactNodesByLevelPKsResponse> createFindExactNodesByLevelPKsResponse(FindExactNodesByLevelPKsResponse value) {
        return new JAXBElement<FindExactNodesByLevelPKsResponse>(_FindExactNodesByLevelPKsResponse_QNAME, FindExactNodesByLevelPKsResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLevelNameByUserAndDimensionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findLevelNameByUserAndDimensionResponse")
    public JAXBElement<FindLevelNameByUserAndDimensionResponse> createFindLevelNameByUserAndDimensionResponse(FindLevelNameByUserAndDimensionResponse value) {
        return new JAXBElement<FindLevelNameByUserAndDimensionResponse>(_FindLevelNameByUserAndDimensionResponse_QNAME, FindLevelNameByUserAndDimensionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindGroupsByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findGroupsByNameResponse")
    public JAXBElement<FindGroupsByNameResponse> createFindGroupsByNameResponse(FindGroupsByNameResponse value) {
        return new JAXBElement<FindGroupsByNameResponse>(_FindGroupsByNameResponse_QNAME, FindGroupsByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLevelNamesByUserAndDimensionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findLevelNamesByUserAndDimensionResponse")
    public JAXBElement<FindLevelNamesByUserAndDimensionResponse> createFindLevelNamesByUserAndDimensionResponse(FindLevelNamesByUserAndDimensionResponse value) {
        return new JAXBElement<FindLevelNamesByUserAndDimensionResponse>(_FindLevelNamesByUserAndDimensionResponse_QNAME, FindLevelNamesByUserAndDimensionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUsersByDimentionAndLevelName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findUsersByDimentionAndLevelName")
    public JAXBElement<FindUsersByDimentionAndLevelName> createFindUsersByDimentionAndLevelName(FindUsersByDimentionAndLevelName value) {
        return new JAXBElement<FindUsersByDimentionAndLevelName>(_FindUsersByDimentionAndLevelName_QNAME, FindUsersByDimentionAndLevelName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindChildrenLevels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findChildrenLevels")
    public JAXBElement<FindChildrenLevels> createFindChildrenLevels(FindChildrenLevels value) {
        return new JAXBElement<FindChildrenLevels>(_FindChildrenLevels_QNAME, FindChildrenLevels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindGroupsContaining }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findGroupsContaining")
    public JAXBElement<FindGroupsContaining> createFindGroupsContaining(FindGroupsContaining value) {
        return new JAXBElement<FindGroupsContaining>(_FindGroupsContaining_QNAME, FindGroupsContaining.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNodesByLevels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getNodesByLevels")
    public JAXBElement<GetNodesByLevels> createGetNodesByLevels(GetNodesByLevels value) {
        return new JAXBElement<GetNodesByLevels>(_GetNodesByLevels_QNAME, GetNodesByLevels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetUserPasswordAndSendEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "resetUserPasswordAndSendEmailResponse")
    public JAXBElement<ResetUserPasswordAndSendEmailResponse> createResetUserPasswordAndSendEmailResponse(ResetUserPasswordAndSendEmailResponse value) {
        return new JAXBElement<ResetUserPasswordAndSendEmailResponse>(_ResetUserPasswordAndSendEmailResponse_QNAME, ResetUserPasswordAndSendEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUsersByDimentionAndLevelNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findUsersByDimentionAndLevelNameResponse")
    public JAXBElement<FindUsersByDimentionAndLevelNameResponse> createFindUsersByDimentionAndLevelNameResponse(FindUsersByDimentionAndLevelNameResponse value) {
        return new JAXBElement<FindUsersByDimentionAndLevelNameResponse>(_FindUsersByDimentionAndLevelNameResponse_QNAME, FindUsersByDimentionAndLevelNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLevelNamesByDimensionNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findLevelNamesByDimensionNameResponse")
    public JAXBElement<FindLevelNamesByDimensionNameResponse> createFindLevelNamesByDimensionNameResponse(FindLevelNamesByDimensionNameResponse value) {
        return new JAXBElement<FindLevelNamesByDimensionNameResponse>(_FindLevelNamesByDimensionNameResponse_QNAME, FindLevelNamesByDimensionNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateLevelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "createLevelResponse")
    public JAXBElement<CreateLevelResponse> createCreateLevelResponse(CreateLevelResponse value) {
        return new JAXBElement<CreateLevelResponse>(_CreateLevelResponse_QNAME, CreateLevelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersFromGroupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getUsersFromGroupResponse")
    public JAXBElement<GetUsersFromGroupResponse> createGetUsersFromGroupResponse(GetUsersFromGroupResponse value) {
        return new JAXBElement<GetUsersFromGroupResponse>(_GetUsersFromGroupResponse_QNAME, GetUsersFromGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNodeByPkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getNodeByPkResponse")
    public JAXBElement<GetNodeByPkResponse> createGetNodeByPkResponse(GetNodeByPkResponse value) {
        return new JAXBElement<GetNodeByPkResponse>(_GetNodeByPkResponse_QNAME, GetNodeByPkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivityAssignee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getActivityAssignee")
    public JAXBElement<GetActivityAssignee> createGetActivityAssignee(GetActivityAssignee value) {
        return new JAXBElement<GetActivityAssignee>(_GetActivityAssignee_QNAME, GetActivityAssignee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeUserPassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "changeUserPassword")
    public JAXBElement<ChangeUserPassword> createChangeUserPassword(ChangeUserPassword value) {
        return new JAXBElement<ChangeUserPassword>(_ChangeUserPassword_QNAME, ChangeUserPassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "createGroup")
    public JAXBElement<CreateGroup> createCreateGroup(CreateGroup value) {
        return new JAXBElement<CreateGroup>(_CreateGroup_QNAME, CreateGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLevelNameByUserAndDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findLevelNameByUserAndDimension")
    public JAXBElement<FindLevelNameByUserAndDimension> createFindLevelNameByUserAndDimension(FindLevelNameByUserAndDimension value) {
        return new JAXBElement<FindLevelNameByUserAndDimension>(_FindLevelNameByUserAndDimension_QNAME, FindLevelNameByUserAndDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateLevelInParentLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "createLevelInParentLevel")
    public JAXBElement<CreateLevelInParentLevel> createCreateLevelInParentLevel(CreateLevelInParentLevel value) {
        return new JAXBElement<CreateLevelInParentLevel>(_CreateLevelInParentLevel_QNAME, CreateLevelInParentLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserToOrganizationalNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "addUserToOrganizationalNode")
    public JAXBElement<AddUserToOrganizationalNode> createAddUserToOrganizationalNode(AddUserToOrganizationalNode value) {
        return new JAXBElement<AddUserToOrganizationalNode>(_AddUserToOrganizationalNode_QNAME, AddUserToOrganizationalNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindParentLevelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findParentLevelResponse")
    public JAXBElement<FindParentLevelResponse> createFindParentLevelResponse(FindParentLevelResponse value) {
        return new JAXBElement<FindParentLevelResponse>(_FindParentLevelResponse_QNAME, FindParentLevelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetUserPasswordAndSendEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "resetUserPasswordAndSendEmail")
    public JAXBElement<ResetUserPasswordAndSendEmail> createResetUserPasswordAndSendEmail(ResetUserPasswordAndSendEmail value) {
        return new JAXBElement<ResetUserPasswordAndSendEmail>(_ResetUserPasswordAndSendEmail_QNAME, ResetUserPasswordAndSendEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBasicNodesContainingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findBasicNodesContainingResponse")
    public JAXBElement<FindBasicNodesContainingResponse> createFindBasicNodesContainingResponse(FindBasicNodesContainingResponse value) {
        return new JAXBElement<FindBasicNodesContainingResponse>(_FindBasicNodesContainingResponse_QNAME, FindBasicNodesContainingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindGroupsContainingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findGroupsContainingResponse")
    public JAXBElement<FindGroupsContainingResponse> createFindGroupsContainingResponse(FindGroupsContainingResponse value) {
        return new JAXBElement<FindGroupsContainingResponse>(_FindGroupsContainingResponse_QNAME, FindGroupsContainingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserPksFromParticipantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getUserPksFromParticipantResponse")
    public JAXBElement<GetUserPksFromParticipantResponse> createGetUserPksFromParticipantResponse(GetUserPksFromParticipantResponse value) {
        return new JAXBElement<GetUserPksFromParticipantResponse>(_GetUserPksFromParticipantResponse_QNAME, GetUserPksFromParticipantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindActiveUserByLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findActiveUserByLogin")
    public JAXBElement<FindActiveUserByLogin> createFindActiveUserByLogin(FindActiveUserByLogin value) {
        return new JAXBElement<FindActiveUserByLogin>(_FindActiveUserByLogin_QNAME, FindActiveUserByLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGroupByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getGroupByNameResponse")
    public JAXBElement<GetGroupByNameResponse> createGetGroupByNameResponse(GetGroupByNameResponse value) {
        return new JAXBElement<GetGroupByNameResponse>(_GetGroupByNameResponse_QNAME, GetGroupByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLevelNamesByDimensionName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findLevelNamesByDimensionName")
    public JAXBElement<FindLevelNamesByDimensionName> createFindLevelNamesByDimensionName(FindLevelNamesByDimensionName value) {
        return new JAXBElement<FindLevelNamesByDimensionName>(_FindLevelNamesByDimensionName_QNAME, FindLevelNamesByDimensionName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrganizationalNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "createOrganizationalNode")
    public JAXBElement<CreateOrganizationalNode> createCreateOrganizationalNode(CreateOrganizationalNode value) {
        return new JAXBElement<CreateOrganizationalNode>(_CreateOrganizationalNode_QNAME, CreateOrganizationalNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindNodesContainingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findNodesContainingResponse")
    public JAXBElement<FindNodesContainingResponse> createFindNodesContainingResponse(FindNodesContainingResponse value) {
        return new JAXBElement<FindNodesContainingResponse>(_FindNodesContainingResponse_QNAME, FindNodesContainingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNodeByPk }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getNodeByPk")
    public JAXBElement<GetNodeByPk> createGetNodeByPk(GetNodeByPk value) {
        return new JAXBElement<GetNodeByPk>(_GetNodeByPk_QNAME, GetNodeByPk.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByPkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getUserByPkResponse")
    public JAXBElement<GetUserByPkResponse> createGetUserByPkResponse(GetUserByPkResponse value) {
        return new JAXBElement<GetUserByPkResponse>(_GetUserByPkResponse_QNAME, GetUserByPkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserPksFromParticipant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getUserPksFromParticipant")
    public JAXBElement<GetUserPksFromParticipant> createGetUserPksFromParticipant(GetUserPksFromParticipant value) {
        return new JAXBElement<GetUserPksFromParticipant>(_GetUserPksFromParticipant_QNAME, GetUserPksFromParticipant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersFromParticipantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getUsersFromParticipantResponse")
    public JAXBElement<GetUsersFromParticipantResponse> createGetUsersFromParticipantResponse(GetUsersFromParticipantResponse value) {
        return new JAXBElement<GetUsersFromParticipantResponse>(_GetUsersFromParticipantResponse_QNAME, GetUsersFromParticipantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLevelsByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findLevelsByNameResponse")
    public JAXBElement<FindLevelsByNameResponse> createFindLevelsByNameResponse(FindLevelsByNameResponse value) {
        return new JAXBElement<FindLevelsByNameResponse>(_FindLevelsByNameResponse_QNAME, FindLevelsByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindNodeByLevelsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findNodeByLevelsResponse")
    public JAXBElement<FindNodeByLevelsResponse> createFindNodeByLevelsResponse(FindNodeByLevelsResponse value) {
        return new JAXBElement<FindNodeByLevelsResponse>(_FindNodeByLevelsResponse_QNAME, FindNodeByLevelsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivityAssigneeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getActivityAssigneeResponse")
    public JAXBElement<GetActivityAssigneeResponse> createGetActivityAssigneeResponse(GetActivityAssigneeResponse value) {
        return new JAXBElement<GetActivityAssigneeResponse>(_GetActivityAssigneeResponse_QNAME, GetActivityAssigneeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNodesByLevelsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getNodesByLevelsResponse")
    public JAXBElement<GetNodesByLevelsResponse> createGetNodesByLevelsResponse(GetNodesByLevelsResponse value) {
        return new JAXBElement<GetNodesByLevelsResponse>(_GetNodesByLevelsResponse_QNAME, GetNodesByLevelsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLevelNamesByUserAndDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findLevelNamesByUserAndDimension")
    public JAXBElement<FindLevelNamesByUserAndDimension> createFindLevelNamesByUserAndDimension(FindLevelNamesByUserAndDimension value) {
        return new JAXBElement<FindLevelNamesByUserAndDimension>(_FindLevelNamesByUserAndDimension_QNAME, FindLevelNamesByUserAndDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDimensionNameByLevelName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findDimensionNameByLevelName")
    public JAXBElement<FindDimensionNameByLevelName> createFindDimensionNameByLevelName(FindDimensionNameByLevelName value) {
        return new JAXBElement<FindDimensionNameByLevelName>(_FindDimensionNameByLevelName_QNAME, FindDimensionNameByLevelName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindNodesContaining }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findNodesContaining")
    public JAXBElement<FindNodesContaining> createFindNodesContaining(FindNodesContaining value) {
        return new JAXBElement<FindNodesContaining>(_FindNodesContaining_QNAME, FindNodesContaining.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeUserPasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "changeUserPasswordResponse")
    public JAXBElement<ChangeUserPasswordResponse> createChangeUserPasswordResponse(ChangeUserPasswordResponse value) {
        return new JAXBElement<ChangeUserPasswordResponse>(_ChangeUserPasswordResponse_QNAME, ChangeUserPasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLevelByDimentionAndLevelNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findLevelByDimentionAndLevelNameResponse")
    public JAXBElement<FindLevelByDimentionAndLevelNameResponse> createFindLevelByDimentionAndLevelNameResponse(FindLevelByDimentionAndLevelNameResponse value) {
        return new JAXBElement<FindLevelByDimentionAndLevelNameResponse>(_FindLevelByDimentionAndLevelNameResponse_QNAME, FindLevelByDimentionAndLevelNameResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindActiveUserByLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findActiveUserByLoginResponse")
    public JAXBElement<FindActiveUserByLoginResponse> createFindActiveUserByLoginResponse(FindActiveUserByLoginResponse value) {
        return new JAXBElement<FindActiveUserByLoginResponse>(_FindActiveUserByLoginResponse_QNAME, FindActiveUserByLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindNodesByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findNodesByNameResponse")
    public JAXBElement<FindNodesByNameResponse> createFindNodesByNameResponse(FindNodesByNameResponse value) {
        return new JAXBElement<FindNodesByNameResponse>(_FindNodesByNameResponse_QNAME, FindNodesByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUsersByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findUsersByName")
    public JAXBElement<FindUsersByName> createFindUsersByName(FindUsersByName value) {
        return new JAXBElement<FindUsersByName>(_FindUsersByName_QNAME, FindUsersByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersFromParticipant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "getUsersFromParticipant")
    public JAXBElement<GetUsersFromParticipant> createGetUsersFromParticipant(GetUsersFromParticipant value) {
        return new JAXBElement<GetUsersFromParticipant>(_GetUsersFromParticipant_QNAME, GetUsersFromParticipant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindNodesByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagetechnology.com.br/agiles_services", name = "findNodesByName")
    public JAXBElement<FindNodesByName> createFindNodesByName(FindNodesByName value) {
        return new JAXBElement<FindNodesByName>(_FindNodesByName_QNAME, FindNodesByName.class, null, value);
    }

}
