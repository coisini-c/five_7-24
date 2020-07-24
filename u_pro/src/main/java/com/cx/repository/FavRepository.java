package com.cx.repository;

import com.cx.entity.Depart;
import com.cx.entity.Favourite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavRepository extends JpaRepository<Favourite,Integer> {

}
