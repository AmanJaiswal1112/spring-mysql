package com.prac.springboot.mysql.api.controller;

import com.prac.springboot.mysql.api.dao.TicketDao;
import com.prac.springboot.mysql.api.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController
{
    @Autowired
    private TicketDao ticketDao;

    @PostMapping("/bookTickets")
    public String bookTicket(@RequestBody List<Ticket> tickets)
    {
        ticketDao.save(tickets);
        return "Book Ticket :"+tickets.size();
    }

    @GetMapping("/getTickets")
    public List<Ticket> getTicket()
    {
        return (List<Ticket>) ticketDao.findAll();
    }
}
