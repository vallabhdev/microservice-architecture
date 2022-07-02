package com.prateeksoni.user.VO;

import com.prateeksoni.user.entity.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Users users;
    private Department department;

    public void setUser(Users users) {
        this.users = users;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
