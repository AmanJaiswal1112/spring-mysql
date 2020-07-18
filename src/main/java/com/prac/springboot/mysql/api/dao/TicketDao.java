package com.prac.springboot.mysql.api.dao;

import com.prac.springboot.mysql.api.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketDao extends CrudRepository<Ticket, Integer>
{
}
