package com.careerit.cbook.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {

        private long id;
        private String firstName;
        private String lastName;
        private String email;
        private String mobile;
        private String city;
        private boolean deleted;

}
