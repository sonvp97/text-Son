package com.codegym.model.repository;

import com.codegym.model.entity.Branch;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BranchRepository extends PagingAndSortingRepository<Branch,Long> {
}
