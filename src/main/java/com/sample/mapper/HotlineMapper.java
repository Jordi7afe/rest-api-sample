package com.sample.mapper;

import com.sample.dto.HotlineDTO;
import com.sample.model.Hotline;
import org.mapstruct.Mapper;

/**
 * Created by amalagraba on 11/10/2017.
 * Arteco Consulting Sl
 * mailto: axel@arteco-consulting.com
 */
@Mapper(componentModel = "spring")
public interface HotlineMapper extends AbstractMapper<Hotline, HotlineDTO> {

}
