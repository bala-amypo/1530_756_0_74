package com.example.demo.service;
import com.example.demo.entity.LocationEntity;
import java.util.List;
public interface LocationEntity{
    LocationEntity createlocation(LocationEntity location);
    List<LocationEntity>getalllocation();
}