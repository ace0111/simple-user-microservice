package com.acedeveloper.app.ws.userservice;

import com.acedeveloper.app.ws.ui.model.request.UserDetailsRequestModel;
import com.acedeveloper.app.ws.ui.model.response.UserRest;

public interface UserService {

	UserRest createUser(UserDetailsRequestModel userDetails);
}
