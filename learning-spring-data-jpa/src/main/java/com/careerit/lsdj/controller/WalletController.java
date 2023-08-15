package com.careerit.lsdj.controller;

import com.careerit.lsdj.dto.WalletDto;
import com.careerit.lsdj.service.WalletService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/wallet")
@RequiredArgsConstructor
public class WalletController {
    
        private final WalletService walletService;

        @GetMapping("/list")
        public ResponseEntity<List<WalletDto>> getWallets(){
            List<WalletDto> list = walletService.getAllWallets();
            return ResponseEntity.ok(list);
        }
}
