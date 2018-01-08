package com.sample.service;

import com.sample.dto.HotlineDTO;
import com.sample.model.Hotline;
import com.sample.repository.HotlineRepository;
import com.sample.service.crud.AbstractCrudService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by amalagraba on 11/10/2017.
 * Arteco Consulting Sl
 * mailto: axel@arteco-consulting.com
 */
@Service
public class HotlineService extends AbstractCrudService<Long, Hotline, HotlineDTO> {

    /**
     * Returns all hotlinellamades created after a certain date
     */
    public List<HotlineDTO> getAfterDate(Date date) {
        return mapper.toDTO(((HotlineRepository) repository).getByDateIsAfter(date));
    }

    /**
     * Saves a hotline assigning a date if none is specified
     */
    public HotlineDTO save(HotlineDTO hotline) {
        if (hotline.getDate() == null) {
            hotline.setDate(new Date());
        }
        return super.save(hotline);
    }
}
