package com.dreamtown.meliatownhouse.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamtown.meliatownhouse.entity.Property;
import com.dreamtown.meliatownhouse.repository.PropertyRepository;

@Service
public class Menu {

    @Autowired
    private PropertyRepository propertyRepository;

    public List<Map> getListProperty() {
        List<Property> listProperty = propertyRepository.findAll();
        List<Map> menus = new ArrayList<>();
        for (Property propery : listProperty) {
            Map data = new HashMap<>();
            data.put("text", propery.getPropertyName());
            data.put("url", "/admin/p/" + propery.getPropertyName());
            menus.add(data);
        }
        return menus;
    }
}
