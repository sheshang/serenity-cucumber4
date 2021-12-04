package com.sheshang.sbsec.demo.auth;

import java.util.Optional;

public interface ApplicationUserDAO {

    public Optional<ApplicationUser> selectApplicationUserByUserName(String userName);
}
