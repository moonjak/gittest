package com.moon.contorller;

import com.moon.pojo.Items;
import com.moon.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ItemsController {

    @Autowired
    private ItemsService itemsService;
    @RequestMapping("queryItems")
    public ModelAndView aqueryItems()
    {
        Items items = itemsService.selectByPrimaryKey(1);
        ModelAndView mv = new ModelAndView();
        mv.addObject("items",items);
        mv.setViewName("itemsList");
        return mv;
    }
}
