package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * POJO for an Id object
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Id {
    @JsonProperty("userid")
    private String userId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("github")
    private String githubId;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithubId() {
        return githubId;
    }

    public void setGithubId(String githubId) {
        this.githubId = githubId;
    }

    @Override
    public String toString() {
        return "userId = " + userId + "\n" +
                "name= " + name + "\n" +
                "githubId =" + githubId + "\n";
    }
}