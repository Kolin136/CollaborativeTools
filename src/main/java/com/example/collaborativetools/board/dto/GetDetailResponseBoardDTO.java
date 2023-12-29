package com.example.collaborativetools.board.dto;

import com.example.collaborativetools.column.entitiy.Columns;
import java.util.List;
import lombok.Builder;

@Builder
public record GetDetailResponseBoardDTO(
    Long columnId, String columnTitle, List<CardInColumnDTO> cardTitleList
) {

  public static GetDetailResponseBoardDTO of(Columns columns, List<CardInColumnDTO> cardDTOList) {
    return GetDetailResponseBoardDTO.builder()
        .columnId(columns.getId())
        .columnTitle(columns.getTitle())
        .cardTitleList(cardDTOList)
        .build();
  }
}
