package com.suncor.coding.demo;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @program: coding
 * @description: 人员
 * @author: sunc
 * @create: 2020-06-16 09:53
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private Integer age;
    private Integer gender;
    private String adress;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equal(name, person.name) &&
                Objects.equal(age, person.age) &&
                Objects.equal(gender, person.gender) &&
                Objects.equal(adress, person.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, age, gender, adress);
    }

    public static void main(String[] args) {
        Set<Person> set = Sets.newHashSet();
        set.add(Person.builder().name("sunc").age(18).gender(1).build());
        set.add(Person.builder().name("sunc").age(18).gender(1).build());
        set.add(Person.builder().name("sunc").age(18).gender(1).build());
        set.add(Person.builder().name("sudan").age(16).gender(0).build());
        set.add(Person.builder().name("sunc").age(18).gender(1).adress("1111").build());

        Set<String> set1 = Sets.newHashSet();
//        set1.add(null);
        Set<String> set2 = Sets.newHashSet();
        set1.addAll(set2);
        System.out.println(set1);

        Map<String,Object> map  = new HashMap(){{
            put("sss","qqqq");
            put("ssqs",1);
        }};
        System.out.println(map);


        System.out.println(StringUtils.capitalize("sssssBbb"));

    }
}
