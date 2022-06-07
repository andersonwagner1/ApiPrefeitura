
package br.com.prefeitura.diadema.ws.agiles;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RolesServices", targetNamespace = "http://imagetechnology.com.br/agiles_services")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RolesServices {


    /**
     * 
     * @param dimentionName
     * @param levelName
     * @return
     *     returns java.util.List<br.com.diadema.ws.agiles.AgilesUser>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findUsersByDimentionAndLevelName", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindUsersByDimentionAndLevelName")
    @ResponseWrapper(localName = "findUsersByDimentionAndLevelNameResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindUsersByDimentionAndLevelNameResponse")
    public List<AgilesUser> findUsersByDimentionAndLevelName(
        @WebParam(name = "dimentionName", targetNamespace = "")
        String dimentionName,
        @WebParam(name = "levelName", targetNamespace = "")
        String levelName);

    /**
     * 
     * @param dimentionName
     * @param levelName
     * @return
     *     returns br.com.diadema.ws.agiles.AgilesItem
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findLevelByDimentionAndLevelName", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindLevelByDimentionAndLevelName")
    @ResponseWrapper(localName = "findLevelByDimentionAndLevelNameResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindLevelByDimentionAndLevelNameResponse")
    public AgilesItem findLevelByDimentionAndLevelName(
        @WebParam(name = "dimentionName", targetNamespace = "")
        String dimentionName,
        @WebParam(name = "levelName", targetNamespace = "")
        String levelName);

    /**
     * 
     * @param groupName
     * @param userPk
     */
    @WebMethod
    @RequestWrapper(localName = "addUserToGroup", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.AddUserToGroup")
    @ResponseWrapper(localName = "addUserToGroupResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.AddUserToGroupResponse")
    public void addUserToGroup(
        @WebParam(name = "groupName", targetNamespace = "")
        String groupName,
        @WebParam(name = "userPk", targetNamespace = "")
        String userPk);

    /**
     * 
     * @param userPk
     */
    @WebMethod
    @RequestWrapper(localName = "resetUserPasswordAndSendEmail", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.ResetUserPasswordAndSendEmail")
    @ResponseWrapper(localName = "resetUserPasswordAndSendEmailResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.ResetUserPasswordAndSendEmailResponse")
    public void resetUserPasswordAndSendEmail(
        @WebParam(name = "userPk", targetNamespace = "")
        String userPk);

    /**
     * 
     * @param levels
     * @param dimensions
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNodesByLevels", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.GetNodesByLevels")
    @ResponseWrapper(localName = "getNodesByLevelsResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.GetNodesByLevelsResponse")
    public List<String> getNodesByLevels(
        @WebParam(name = "dimensions", targetNamespace = "")
        List<String> dimensions,
        @WebParam(name = "levels", targetNamespace = "")
        List<String> levels);

    /**
     * 
     * @param groupName
     * @param description
     * @param usersPks
     */
    @WebMethod
    @RequestWrapper(localName = "createGroup", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.CreateGroup")
    @ResponseWrapper(localName = "createGroupResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.CreateGroupResponse")
    public void createGroup(
        @WebParam(name = "groupName", targetNamespace = "")
        String groupName,
        @WebParam(name = "description", targetNamespace = "")
        String description,
        @WebParam(name = "usersPks", targetNamespace = "")
        List<String> usersPks);

    /**
     * 
     * @param dimentionName
     * @param levelName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createLevel", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.CreateLevel")
    @ResponseWrapper(localName = "createLevelResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.CreateLevelResponse")
    public String createLevel(
        @WebParam(name = "dimentionName", targetNamespace = "")
        String dimentionName,
        @WebParam(name = "levelName", targetNamespace = "")
        String levelName);

    /**
     * 
     * @param nodePk
     * @return
     *     returns br.com.diadema.ws.agiles.AgilesOrganizationalNode
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNodeByPk", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.GetNodeByPk")
    @ResponseWrapper(localName = "getNodeByPkResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.GetNodeByPkResponse")
    public AgilesOrganizationalNode getNodeByPk(
        @WebParam(name = "nodePk", targetNamespace = "")
        String nodePk);

    /**
     * 
     * @param participantPk
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserPksFromParticipant", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.GetUserPksFromParticipant")
    @ResponseWrapper(localName = "getUserPksFromParticipantResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.GetUserPksFromParticipantResponse")
    public List<String> getUserPksFromParticipant(
        @WebParam(name = "participantPk", targetNamespace = "")
        String participantPk);

    /**
     * 
     * @param nodePk
     * @param userPk
     */
    @WebMethod
    @RequestWrapper(localName = "addUserToOrganizationalNode", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.AddUserToOrganizationalNode")
    @ResponseWrapper(localName = "addUserToOrganizationalNodeResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.AddUserToOrganizationalNodeResponse")
    public void addUserToOrganizationalNode(
        @WebParam(name = "nodePk", targetNamespace = "")
        String nodePk,
        @WebParam(name = "userPk", targetNamespace = "")
        String userPk);

    /**
     * 
     * @param levelName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findDimensionNameByLevelName", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindDimensionNameByLevelName")
    @ResponseWrapper(localName = "findDimensionNameByLevelNameResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindDimensionNameByLevelNameResponse")
    public String findDimensionNameByLevelName(
        @WebParam(name = "levelName", targetNamespace = "")
        String levelName);

    /**
     * 
     * @param password
     * @param newUser
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createUser", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.CreateUser")
    @ResponseWrapper(localName = "createUserResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.CreateUserResponse")
    public String createUser(
        @WebParam(name = "newUser", targetNamespace = "")
        AgilesUser newUser,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param userName
     * @return
     *     returns java.util.List<br.com.diadema.ws.agiles.AgilesUser>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findUsersByName", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindUsersByName")
    @ResponseWrapper(localName = "findUsersByNameResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindUsersByNameResponse")
    public List<AgilesUser> findUsersByName(
        @WebParam(name = "userName", targetNamespace = "")
        String userName);

    /**
     * 
     * @param nodeName
     * @return
     *     returns java.util.List<br.com.diadema.ws.agiles.AgilesOrganizationalNode>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findNodesByName", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindNodesByName")
    @ResponseWrapper(localName = "findNodesByNameResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindNodesByNameResponse")
    public List<AgilesOrganizationalNode> findNodesByName(
        @WebParam(name = "nodeName", targetNamespace = "")
        String nodeName);

    /**
     * 
     * @param parentLevelPk
     * @param levelName
     * @param dimensionName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createLevelInParentLevel", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.CreateLevelInParentLevel")
    @ResponseWrapper(localName = "createLevelInParentLevelResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.CreateLevelInParentLevelResponse")
    public String createLevelInParentLevel(
        @WebParam(name = "dimensionName", targetNamespace = "")
        String dimensionName,
        @WebParam(name = "levelName", targetNamespace = "")
        String levelName,
        @WebParam(name = "parentLevelPk", targetNamespace = "")
        String parentLevelPk);

    /**
     * 
     * @param userPk
     * @return
     *     returns br.com.diadema.ws.agiles.AgilesUser
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserByPk", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.GetUserByPk")
    @ResponseWrapper(localName = "getUserByPkResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.GetUserByPkResponse")
    public AgilesUser getUserByPk(
        @WebParam(name = "userPk", targetNamespace = "")
        String userPk);

    /**
     * 
     * @param levelName
     * @param dimensionName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findParentLevel", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindParentLevel")
    @ResponseWrapper(localName = "findParentLevelResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindParentLevelResponse")
    public String findParentLevel(
        @WebParam(name = "dimensionName", targetNamespace = "")
        String dimensionName,
        @WebParam(name = "levelName", targetNamespace = "")
        String levelName);

    /**
     * 
     * @param levelName
     * @return
     *     returns java.util.List<br.com.diadema.ws.agiles.AgilesOrganizationalLevel>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findLevelsByName", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindLevelsByName")
    @ResponseWrapper(localName = "findLevelsByNameResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindLevelsByNameResponse")
    public List<AgilesOrganizationalLevel> findLevelsByName(
        @WebParam(name = "levelName", targetNamespace = "")
        String levelName);

    /**
     * 
     * @param dimensionName
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findLevelNamesByDimensionName", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindLevelNamesByDimensionName")
    @ResponseWrapper(localName = "findLevelNamesByDimensionNameResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindLevelNamesByDimensionNameResponse")
    public List<String> findLevelNamesByDimensionName(
        @WebParam(name = "dimensionName", targetNamespace = "")
        String dimensionName);

    /**
     * 
     * @param levels
     * @param dimensions
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findNodesByLevels", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindNodesByLevels")
    @ResponseWrapper(localName = "findNodesByLevelsResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindNodesByLevelsResponse")
    public List<String> findNodesByLevels(
        @WebParam(name = "dimensions", targetNamespace = "")
        List<String> dimensions,
        @WebParam(name = "levels", targetNamespace = "")
        List<String> levels);

    /**
     * 
     * @param userPk
     * @return
     *     returns java.util.List<br.com.diadema.ws.agiles.AgilesGroup>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findGroupsContaining", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindGroupsContaining")
    @ResponseWrapper(localName = "findGroupsContainingResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindGroupsContainingResponse")
    public List<AgilesGroup> findGroupsContaining(
        @WebParam(name = "userPk", targetNamespace = "")
        String userPk);

    /**
     * 
     * @param userActivityInstancePk
     * @return
     *     returns java.util.List<br.com.diadema.ws.agiles.AgilesItem>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getActivityAssignee", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.GetActivityAssignee")
    @ResponseWrapper(localName = "getActivityAssigneeResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.GetActivityAssigneeResponse")
    public List<AgilesItem> getActivityAssignee(
        @WebParam(name = "userActivityInstancePk", targetNamespace = "")
        String userActivityInstancePk);

    /**
     * 
     * @param modifiedUser
     */
    @WebMethod
    @RequestWrapper(localName = "modifyUser", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.ModifyUser")
    @ResponseWrapper(localName = "modifyUserResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.ModifyUserResponse")
    public void modifyUser(
        @WebParam(name = "modifiedUser", targetNamespace = "")
        AgilesUser modifiedUser);

    /**
     * 
     * @param levelsPK
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findExactNodesByLevelPKs", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindExactNodesByLevelPKs")
    @ResponseWrapper(localName = "findExactNodesByLevelPKsResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindExactNodesByLevelPKsResponse")
    public List<String> findExactNodesByLevelPKs(
        @WebParam(name = "levelsPK", targetNamespace = "")
        List<String> levelsPK);

    /**
     * 
     * @param groupName
     * @return
     *     returns java.util.List<br.com.diadema.ws.agiles.AgilesItem>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findGroupsByName", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindGroupsByName")
    @ResponseWrapper(localName = "findGroupsByNameResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindGroupsByNameResponse")
    public List<AgilesItem> findGroupsByName(
        @WebParam(name = "groupName", targetNamespace = "")
        String groupName);

    /**
     * 
     * @param levelName
     * @param dimensionName
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findChildrenLevels", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindChildrenLevels")
    @ResponseWrapper(localName = "findChildrenLevelsResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindChildrenLevelsResponse")
    public List<String> findChildrenLevels(
        @WebParam(name = "dimensionName", targetNamespace = "")
        String dimensionName,
        @WebParam(name = "levelName", targetNamespace = "")
        String levelName);

    /**
     * 
     * @param newPass
     * @param userPk
     * @param oldPass
     */
    @WebMethod
    @RequestWrapper(localName = "changeUserPassword", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.ChangeUserPassword")
    @ResponseWrapper(localName = "changeUserPasswordResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.ChangeUserPasswordResponse")
    public void changeUserPassword(
        @WebParam(name = "userPk", targetNamespace = "")
        String userPk,
        @WebParam(name = "oldPass", targetNamespace = "")
        String oldPass,
        @WebParam(name = "newPass", targetNamespace = "")
        String newPass);

    /**
     * 
     * @param userPk
     * @return
     *     returns java.util.List<br.com.diadema.ws.agiles.AgilesItem>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findBasicNodesContaining", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindBasicNodesContaining")
    @ResponseWrapper(localName = "findBasicNodesContainingResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindBasicNodesContainingResponse")
    public List<AgilesItem> findBasicNodesContaining(
        @WebParam(name = "userPk", targetNamespace = "")
        String userPk);

    /**
     * 
     * @param userPk
     * @return
     *     returns java.util.List<br.com.diadema.ws.agiles.AgilesOrganizationalNode>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findNodesContaining", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindNodesContaining")
    @ResponseWrapper(localName = "findNodesContainingResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindNodesContainingResponse")
    public List<AgilesOrganizationalNode> findNodesContaining(
        @WebParam(name = "userPk", targetNamespace = "")
        String userPk);

    /**
     * 
     * @param groupName
     * @return
     *     returns java.util.List<br.com.diadema.ws.agiles.AgilesUser>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsersFromGroup", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.GetUsersFromGroup")
    @ResponseWrapper(localName = "getUsersFromGroupResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.GetUsersFromGroupResponse")
    public List<AgilesUser> getUsersFromGroup(
        @WebParam(name = "groupName", targetNamespace = "")
        String groupName);

    /**
     * 
     * @param levelDimensionPairs
     * @param name
     * @param description
     * @param createdByPk
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createOrganizationalNode", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.CreateOrganizationalNode")
    @ResponseWrapper(localName = "createOrganizationalNodeResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.CreateOrganizationalNodeResponse")
    public String createOrganizationalNode(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "description", targetNamespace = "")
        String description,
        @WebParam(name = "createdByPk", targetNamespace = "")
        String createdByPk,
        @WebParam(name = "levelDimensionPairs", targetNamespace = "")
        List<LevelDimensionPair> levelDimensionPairs);

    /**
     * 
     * @param userPk
     * @param dimensionName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findLevelNameByUserAndDimension", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindLevelNameByUserAndDimension")
    @ResponseWrapper(localName = "findLevelNameByUserAndDimensionResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindLevelNameByUserAndDimensionResponse")
    public String findLevelNameByUserAndDimension(
        @WebParam(name = "userPk", targetNamespace = "")
        String userPk,
        @WebParam(name = "dimensionName", targetNamespace = "")
        String dimensionName);

    /**
     * 
     * @param levels
     * @param dimensions
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNodeByLevels", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.GetNodeByLevels")
    @ResponseWrapper(localName = "getNodeByLevelsResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.GetNodeByLevelsResponse")
    public String getNodeByLevels(
        @WebParam(name = "dimensions", targetNamespace = "")
        List<String> dimensions,
        @WebParam(name = "levels", targetNamespace = "")
        List<String> levels);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGroupByName", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.GetGroupByName")
    @ResponseWrapper(localName = "getGroupByNameResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.GetGroupByNameResponse")
    public String getGroupByName(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param participantPk
     * @return
     *     returns java.util.List<br.com.diadema.ws.agiles.AgilesUser>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsersFromParticipant", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.GetUsersFromParticipant")
    @ResponseWrapper(localName = "getUsersFromParticipantResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.GetUsersFromParticipantResponse")
    public List<AgilesUser> getUsersFromParticipant(
        @WebParam(name = "participantPk", targetNamespace = "")
        String participantPk);

    /**
     * 
     * @param levels
     * @param dimensions
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findNodeByLevels", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindNodeByLevels")
    @ResponseWrapper(localName = "findNodeByLevelsResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindNodeByLevelsResponse")
    public String findNodeByLevels(
        @WebParam(name = "dimensions", targetNamespace = "")
        List<String> dimensions,
        @WebParam(name = "levels", targetNamespace = "")
        List<String> levels);

    /**
     * 
     * @param login
     * @return
     *     returns br.com.diadema.ws.agiles.AgilesUser
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findActiveUserByLogin", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindActiveUserByLogin")
    @ResponseWrapper(localName = "findActiveUserByLoginResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindActiveUserByLoginResponse")
    public AgilesUser findActiveUserByLogin(
        @WebParam(name = "login", targetNamespace = "")
        String login);

    /**
     * 
     * @param userPk
     * @param dimensionName
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findLevelNamesByUserAndDimension", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindLevelNamesByUserAndDimension")
    @ResponseWrapper(localName = "findLevelNamesByUserAndDimensionResponse", targetNamespace = "http://imagetechnology.com.br/agiles_services", className = "br.com.diadema.ws.agiles.FindLevelNamesByUserAndDimensionResponse")
    public List<String> findLevelNamesByUserAndDimension(
        @WebParam(name = "userPk", targetNamespace = "")
        String userPk,
        @WebParam(name = "dimensionName", targetNamespace = "")
        String dimensionName);

}