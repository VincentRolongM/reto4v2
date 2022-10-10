package com.example.demo.Repositorio;

import com.example.demo.Interface.ToolInterface;
import com.example.demo.Modelo.Tool;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ToolRepository {
    
    @Autowired
    private ToolInterface extencionesCrud;
    
    public List<Tool> getAll(){
       return (List<Tool>) extencionesCrud.findAll();
    }
    
    public Optional<Tool> getTool(int id){
        
        return extencionesCrud.findById(id);
        
    }
    
    public Tool save(Tool tool){
     return extencionesCrud.save(tool);
    }
    
      public void delete(Tool tool){
       extencionesCrud.delete(tool);
    }
}