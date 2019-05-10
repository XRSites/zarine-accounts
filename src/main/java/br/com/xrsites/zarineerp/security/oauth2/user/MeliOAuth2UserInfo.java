package br.com.xrsites.zarineerp.security.oauth2.user;

import java.util.Map;

public class MeliOAuth2UserInfo extends OAuth2UserInfo {
    public MeliOAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }

    @Override
    public String getId() {
        return (String) attributes.get("id");
    }

    @Override
    public String getName() {
        return (String) attributes.get("first_name");
    }
    
    @Override
    public String getEmail() {
        return (String) attributes.get("email");
    }

    @Override
    public String getImageUrl() {
        return "";
    }
}