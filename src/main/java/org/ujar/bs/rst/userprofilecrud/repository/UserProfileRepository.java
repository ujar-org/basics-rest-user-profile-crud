package org.ujar.bs.rst.userprofilecrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.ujar.bs.rst.userprofilecrud.entity.UserProfile;

public interface UserProfileRepository
    extends PagingAndSortingRepository<UserProfile, Long>, JpaRepository<UserProfile, Long> {

}