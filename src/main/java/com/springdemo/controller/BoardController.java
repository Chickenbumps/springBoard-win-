package com.springdemo.controller;

import com.springdemo.model.BoardVO;
import com.springdemo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/*")
public class BoardController {

    @Autowired
    BoardService service;

    @RequestMapping(value="/board", method= RequestMethod.GET)
    public String writeView() throws Exception {
        return "board/board";
    }

    @RequestMapping(value="/write",method= RequestMethod.POST)
    public String write(BoardVO boardVO) throws Exception {
        service.write(boardVO);

        return "redirect:/";
    }

    @RequestMapping(value = "/list", method= RequestMethod.GET)
    public String list(Model model) throws Exception{
        model.addAttribute("list",service.selectBoardList());
        return "board/list";
    }

    @RequestMapping(value = "/readView",method= RequestMethod.GET)
    public String read(BoardVO boardVO, Model model) throws Exception{
        model.addAttribute("read",service.read(boardVO.getBno()));
        return "board/readView";
    }


    @RequestMapping(value = "/update",method= RequestMethod.POST)
    public String update(BoardVO boardVO) throws Exception{
        service.update(boardVO);
        return "redirect:/board/list";
    }

    @RequestMapping(value= "/delete", method= RequestMethod.POST)
    public String delete(BoardVO boardVO) throws Exception{
        service.delete(boardVO.getBno());
        return "redirect:/board/list";
    }
}
