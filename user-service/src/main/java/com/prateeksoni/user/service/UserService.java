package com.prateeksoni.user.service;

import com.prateeksoni.user.VO.Department;
import com.prateeksoni.user.VO.ResponseTemplateVO;
import com.prateeksoni.user.entity.Users;
import com.prateeksoni.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    public Users saveUser(Users users) {
        return userRepository.save(users);
    }

    public ResponseTemplateVO getUserByDept(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Users users = userRepository.findByUserId(userId);
        String url = "http://DEPARTMENT-SERVICE/departments/" + users.getDepartmentId();
        Department department = restTemplate.getForObject(url, Department.class);
        vo.setUser(users);
        vo.setDepartment(department);
        return vo;
    }
}
