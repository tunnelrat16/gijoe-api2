package com.tunnelrat16.gijoeapi2.vehicle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

import lombok.Data;

@Entity
@Data
@Table(name = "vehicle")
public class Vehicle {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "name")
  private String name;

  @Column(name = "version")
  private String version;

  @Column(name = "year")
  private String year;

  @Column(name = "team")
  private String team;

  @Column(name = "aka")
  private String aka;

  @Column(name = "image_url")
  private String imageUrl;

  @Column(name = "watch_list")
  private String watchList;

  @Column(name = "total")
  private String total;

  @Column(name = "variant")
  private String variant;

  @Column(name = "notes")
  private String notes;
}