package com.jihoon.board.dto.request.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PatchUserProfileRequestDto {
  private String profileImage;  
}
