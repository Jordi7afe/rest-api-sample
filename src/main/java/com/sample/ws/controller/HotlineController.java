package com.sample.ws.controller;

import com.sample.dto.HotlineDTO;
import com.sample.service.HotlineService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by amalagraba on 11/10/2017.
 * Arteco Consulting Sl
 * mailto: axel@arteco-consulting.com
 */
@RequestMapping("/hotline")
@RestController
public class HotlineController extends CrudController<Long, HotlineDTO> {

    @GetMapping("/after/{date}")
    public List<HotlineDTO> getAfterDate(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        return ((HotlineService) service).getAfterDate(date);
    }
}
