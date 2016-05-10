
package com.amberfin.schema.transcoderparameters;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputs">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="input" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="file" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="stream" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="countingmode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="stlstream" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="line" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="crop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="interlacedominanceoverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="audiogain" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="audio" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="channel" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="channelgroup" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="channel" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="segments">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="segment" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="input" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="in" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="out" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="attributes" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="attribute" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="anchor" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="timecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="output" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="audio" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="group" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                                       &lt;element name="channelgroup" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="attributes" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="attribute" maxOccurs="unbounded">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="attributes" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="attribute" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="gain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="limiter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="samplerate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="resamplequality" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="bitwidth" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="captions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="stream" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                             &lt;element name="caption" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="parameters" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="stlcaptions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="stream" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;attribute name="line" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="output" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="starttimecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="anchortimecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="watermark" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="teletraxlogging" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="customerid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="itemid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="slug" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="file" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="payload" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="teletraxlocation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="teletraxprogramname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="teletraxdb" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="overlays" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="timecode" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="font" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="fontsize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="fillbackground" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="segments" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="text" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="colour">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="backgroundcolour">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="opacity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="font" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="fontsize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="fontstyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="horizontalalignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="verticalalignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="segments" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="logo" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="file">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="opacity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="prekeyed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="alphapresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="segments" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="directory" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="file" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="containersize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="display" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="size" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="offset" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="aspectratio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="border" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="attributes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="attribute" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="singlepass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="conversion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="template" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="template" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inputs",
    "segments",
    "output"
})
@XmlRootElement(name = "transcodeparameters")
public class Transcodeparameters {

    @XmlElement(required = true)
    protected Transcodeparameters.Inputs inputs;
    @XmlElement(required = true)
    protected Transcodeparameters.Segments segments;
    @XmlElement(required = true)
    protected List<Transcodeparameters.Output> output;
    @XmlAttribute(name = "template")
    protected String template;

    /**
     * Ruft den Wert der inputs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Transcodeparameters.Inputs }
     *     
     */
    public Transcodeparameters.Inputs getInputs() {
        return inputs;
    }

    /**
     * Legt den Wert der inputs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Transcodeparameters.Inputs }
     *     
     */
    public void setInputs(Transcodeparameters.Inputs value) {
        this.inputs = value;
    }

    /**
     * Ruft den Wert der segments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Transcodeparameters.Segments }
     *     
     */
    public Transcodeparameters.Segments getSegments() {
        return segments;
    }

    /**
     * Legt den Wert der segments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Transcodeparameters.Segments }
     *     
     */
    public void setSegments(Transcodeparameters.Segments value) {
        this.segments = value;
    }

    /**
     * Gets the value of the output property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the output property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transcodeparameters.Output }
     * 
     * 
     */
    public List<Transcodeparameters.Output> getOutput() {
        if (output == null) {
            output = new ArrayList<Transcodeparameters.Output>();
        }
        return this.output;
    }

    /**
     * Ruft den Wert der template-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplate() {
        return template;
    }

    /**
     * Legt den Wert der template-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplate(String value) {
        this.template = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="input" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="file" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="stream" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="countingmode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="stlstream" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="line" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="crop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="interlacedominanceoverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="audiogain" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="audio" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="channel" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="channelgroup" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="channel" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "input"
    })
    public static class Inputs {

        @XmlElement(required = true)
        protected List<Transcodeparameters.Inputs.Input> input;

        /**
         * Gets the value of the input property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the input property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInput().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Transcodeparameters.Inputs.Input }
         * 
         * 
         */
        public List<Transcodeparameters.Inputs.Input> getInput() {
            if (input == null) {
                input = new ArrayList<Transcodeparameters.Inputs.Input>();
            }
            return this.input;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="file" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="stream" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                           &lt;/sequence>
         *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="countingmode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="stlstream" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                           &lt;/sequence>
         *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="line" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="crop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="interlacedominanceoverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="audiogain" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="audio" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="channel" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="channelgroup" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="channel" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "file"
        })
        public static class Input {

            @XmlElement(required = true)
            protected List<Transcodeparameters.Inputs.Input.File> file;
            @XmlAttribute(name = "id", required = true)
            protected String id;

            /**
             * Gets the value of the file property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the file property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFile().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Transcodeparameters.Inputs.Input.File }
             * 
             * 
             */
            public List<Transcodeparameters.Inputs.Input.File> getFile() {
                if (file == null) {
                    file = new ArrayList<Transcodeparameters.Inputs.Input.File>();
                }
                return this.file;
            }

            /**
             * Ruft den Wert der id-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Legt den Wert der id-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="stream" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                 &lt;/sequence>
             *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="countingmode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="stlstream" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                 &lt;/sequence>
             *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="line" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="crop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="interlacedominanceoverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="audiogain" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="audio" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="channel" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                           &lt;/sequence>
             *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="channelgroup" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="channel" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "stream",
                "stlstream",
                "crop",
                "interlacedominanceoverride",
                "audiogain",
                "audio"
            })
            public static class File {

                protected Transcodeparameters.Inputs.Input.File.Stream stream;
                @XmlElement(nillable = true)
                protected List<Transcodeparameters.Inputs.Input.File.Stlstream> stlstream;
                protected String crop;
                protected String interlacedominanceoverride;
                protected BigDecimal audiogain;
                protected Transcodeparameters.Inputs.Input.File.Audio audio;
                @XmlAttribute(name = "name", required = true)
                protected String name;

                /**
                 * Ruft den Wert der stream-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Transcodeparameters.Inputs.Input.File.Stream }
                 *     
                 */
                public Transcodeparameters.Inputs.Input.File.Stream getStream() {
                    return stream;
                }

                /**
                 * Legt den Wert der stream-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Transcodeparameters.Inputs.Input.File.Stream }
                 *     
                 */
                public void setStream(Transcodeparameters.Inputs.Input.File.Stream value) {
                    this.stream = value;
                }

                /**
                 * Gets the value of the stlstream property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the stlstream property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getStlstream().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Transcodeparameters.Inputs.Input.File.Stlstream }
                 * 
                 * 
                 */
                public List<Transcodeparameters.Inputs.Input.File.Stlstream> getStlstream() {
                    if (stlstream == null) {
                        stlstream = new ArrayList<Transcodeparameters.Inputs.Input.File.Stlstream>();
                    }
                    return this.stlstream;
                }

                /**
                 * Ruft den Wert der crop-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCrop() {
                    return crop;
                }

                /**
                 * Legt den Wert der crop-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCrop(String value) {
                    this.crop = value;
                }

                /**
                 * Ruft den Wert der interlacedominanceoverride-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInterlacedominanceoverride() {
                    return interlacedominanceoverride;
                }

                /**
                 * Legt den Wert der interlacedominanceoverride-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInterlacedominanceoverride(String value) {
                    this.interlacedominanceoverride = value;
                }

                /**
                 * Ruft den Wert der audiogain-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAudiogain() {
                    return audiogain;
                }

                /**
                 * Legt den Wert der audiogain-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAudiogain(BigDecimal value) {
                    this.audiogain = value;
                }

                /**
                 * Ruft den Wert der audio-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Transcodeparameters.Inputs.Input.File.Audio }
                 *     
                 */
                public Transcodeparameters.Inputs.Input.File.Audio getAudio() {
                    return audio;
                }

                /**
                 * Legt den Wert der audio-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Transcodeparameters.Inputs.Input.File.Audio }
                 *     
                 */
                public void setAudio(Transcodeparameters.Inputs.Input.File.Audio value) {
                    this.audio = value;
                }

                /**
                 * Ruft den Wert der name-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Legt den Wert der name-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="channel" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="channelgroup" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="channel" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "channel",
                    "channelgroup"
                })
                public static class Audio {

                    @XmlElement(nillable = true)
                    protected List<Transcodeparameters.Inputs.Input.File.Audio.Channel> channel;
                    @XmlElement(nillable = true)
                    protected List<Transcodeparameters.Inputs.Input.File.Audio.Channelgroup> channelgroup;
                    @XmlAttribute(name = "offset")
                    protected BigInteger offset;
                    @XmlAttribute(name = "encoding")
                    protected String encoding;

                    /**
                     * Gets the value of the channel property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the channel property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getChannel().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Transcodeparameters.Inputs.Input.File.Audio.Channel }
                     * 
                     * 
                     */
                    public List<Transcodeparameters.Inputs.Input.File.Audio.Channel> getChannel() {
                        if (channel == null) {
                            channel = new ArrayList<Transcodeparameters.Inputs.Input.File.Audio.Channel>();
                        }
                        return this.channel;
                    }

                    /**
                     * Gets the value of the channelgroup property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the channelgroup property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getChannelgroup().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Transcodeparameters.Inputs.Input.File.Audio.Channelgroup }
                     * 
                     * 
                     */
                    public List<Transcodeparameters.Inputs.Input.File.Audio.Channelgroup> getChannelgroup() {
                        if (channelgroup == null) {
                            channelgroup = new ArrayList<Transcodeparameters.Inputs.Input.File.Audio.Channelgroup>();
                        }
                        return this.channelgroup;
                    }

                    /**
                     * Ruft den Wert der offset-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getOffset() {
                        return offset;
                    }

                    /**
                     * Legt den Wert der offset-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setOffset(BigInteger value) {
                        this.offset = value;
                    }

                    /**
                     * Ruft den Wert der encoding-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEncoding() {
                        return encoding;
                    }

                    /**
                     * Legt den Wert der encoding-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEncoding(String value) {
                        this.encoding = value;
                    }


                    /**
                     * <p>Java-Klasse für anonymous complex type.
                     * 
                     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *       &lt;/sequence>
                     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Channel {

                        @XmlAttribute(name = "id", required = true)
                        protected String id;
                        @XmlAttribute(name = "index", required = true)
                        protected String index;
                        @XmlAttribute(name = "encoding")
                        protected String encoding;

                        /**
                         * Ruft den Wert der id-Eigenschaft ab.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getId() {
                            return id;
                        }

                        /**
                         * Legt den Wert der id-Eigenschaft fest.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setId(String value) {
                            this.id = value;
                        }

                        /**
                         * Ruft den Wert der index-Eigenschaft ab.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getIndex() {
                            return index;
                        }

                        /**
                         * Legt den Wert der index-Eigenschaft fest.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setIndex(String value) {
                            this.index = value;
                        }

                        /**
                         * Ruft den Wert der encoding-Eigenschaft ab.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEncoding() {
                            return encoding;
                        }

                        /**
                         * Legt den Wert der encoding-Eigenschaft fest.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEncoding(String value) {
                            this.encoding = value;
                        }

                    }


                    /**
                     * <p>Java-Klasse für anonymous complex type.
                     * 
                     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="channel" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "channel"
                    })
                    public static class Channelgroup {

                        @XmlElement(nillable = true)
                        protected List<Transcodeparameters.Inputs.Input.File.Audio.Channelgroup.Channel> channel;
                        @XmlAttribute(name = "id", required = true)
                        protected String id;

                        /**
                         * Gets the value of the channel property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the channel property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getChannel().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Transcodeparameters.Inputs.Input.File.Audio.Channelgroup.Channel }
                         * 
                         * 
                         */
                        public List<Transcodeparameters.Inputs.Input.File.Audio.Channelgroup.Channel> getChannel() {
                            if (channel == null) {
                                channel = new ArrayList<Transcodeparameters.Inputs.Input.File.Audio.Channelgroup.Channel>();
                            }
                            return this.channel;
                        }

                        /**
                         * Ruft den Wert der id-Eigenschaft ab.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getId() {
                            return id;
                        }

                        /**
                         * Legt den Wert der id-Eigenschaft fest.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setId(String value) {
                            this.id = value;
                        }


                        /**
                         * <p>Java-Klasse für anonymous complex type.
                         * 
                         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *       &lt;/sequence>
                         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Channel {

                            @XmlAttribute(name = "id", required = true)
                            protected String id;
                            @XmlAttribute(name = "index", required = true)
                            protected String index;
                            @XmlAttribute(name = "encoding")
                            protected String encoding;

                            /**
                             * Ruft den Wert der id-Eigenschaft ab.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getId() {
                                return id;
                            }

                            /**
                             * Legt den Wert der id-Eigenschaft fest.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setId(String value) {
                                this.id = value;
                            }

                            /**
                             * Ruft den Wert der index-Eigenschaft ab.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getIndex() {
                                return index;
                            }

                            /**
                             * Legt den Wert der index-Eigenschaft fest.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setIndex(String value) {
                                this.index = value;
                            }

                            /**
                             * Ruft den Wert der encoding-Eigenschaft ab.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getEncoding() {
                                return encoding;
                            }

                            /**
                             * Legt den Wert der encoding-Eigenschaft fest.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setEncoding(String value) {
                                this.encoding = value;
                            }

                        }

                    }

                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *       &lt;/sequence>
                 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="line" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Stlstream {

                    @XmlAttribute(name = "id", required = true)
                    protected String id;
                    @XmlAttribute(name = "type")
                    protected String type;
                    @XmlAttribute(name = "page")
                    protected BigInteger page;
                    @XmlAttribute(name = "line")
                    protected BigInteger line;

                    /**
                     * Ruft den Wert der id-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getId() {
                        return id;
                    }

                    /**
                     * Legt den Wert der id-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setId(String value) {
                        this.id = value;
                    }

                    /**
                     * Ruft den Wert der type-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Legt den Wert der type-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                    /**
                     * Ruft den Wert der page-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getPage() {
                        return page;
                    }

                    /**
                     * Legt den Wert der page-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setPage(BigInteger value) {
                        this.page = value;
                    }

                    /**
                     * Ruft den Wert der line-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getLine() {
                        return line;
                    }

                    /**
                     * Legt den Wert der line-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setLine(BigInteger value) {
                        this.line = value;
                    }

                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *       &lt;/sequence>
                 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="countingmode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Stream {

                    @XmlAttribute(name = "id", required = true)
                    protected String id;
                    @XmlAttribute(name = "offset")
                    protected BigInteger offset;
                    @XmlAttribute(name = "countingmode")
                    protected String countingmode;

                    /**
                     * Ruft den Wert der id-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getId() {
                        return id;
                    }

                    /**
                     * Legt den Wert der id-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setId(String value) {
                        this.id = value;
                    }

                    /**
                     * Ruft den Wert der offset-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getOffset() {
                        return offset;
                    }

                    /**
                     * Legt den Wert der offset-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setOffset(BigInteger value) {
                        this.offset = value;
                    }

                    /**
                     * Ruft den Wert der countingmode-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCountingmode() {
                        return countingmode;
                    }

                    /**
                     * Legt den Wert der countingmode-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCountingmode(String value) {
                        this.countingmode = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="audio" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="group" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                             &lt;element name="channelgroup" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="attributes" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="attribute" maxOccurs="unbounded">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="attributes" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="attribute" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="gain" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="limiter" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="samplerate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="resamplequality" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="bitwidth" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="captions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="stream" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                   &lt;element name="caption" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                           &lt;/sequence>
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="parameters" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="stlcaptions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="stream" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                           &lt;/sequence>
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                           &lt;attribute name="line" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                           &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="output" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="starttimecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="anchortimecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="watermark" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="teletraxlogging" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="customerid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="itemid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="slug" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="file" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="payload" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="teletraxlocation" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="teletraxprogramname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="teletraxdb" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="overlays" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="timecode" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="font" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="fontsize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="fillbackground" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="segments" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="text" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="colour">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="backgroundcolour">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="opacity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="font" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="fontsize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="fontstyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="horizontalalignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="verticalalignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="segments" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="logo" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="file">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="opacity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="prekeyed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="alphapresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="segments" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="directory" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="file" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="containersize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="display" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="size" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                           &lt;/sequence>
     *                           &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="offset" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                           &lt;/sequence>
     *                           &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="aspectratio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="border" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="attributes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="attribute" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                           &lt;/sequence>
     *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="singlepass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="conversion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="template" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "audio",
        "captions",
        "stlcaptions",
        "starttimecode",
        "anchortimecode",
        "watermark",
        "overlays",
        "directory",
        "file",
        "containersize",
        "display",
        "attributes",
        "singlepass"
    })
    public static class Output {

        protected Transcodeparameters.Output.Audio audio;
        protected Transcodeparameters.Output.Captions captions;
        protected Transcodeparameters.Output.Stlcaptions stlcaptions;
        protected String starttimecode;
        protected String anchortimecode;
        protected Transcodeparameters.Output.Watermark watermark;
        protected Transcodeparameters.Output.Overlays overlays;
        protected Transcodeparameters.Output.Directory directory;
        protected Transcodeparameters.Output.File file;
        protected String containersize;
        protected Transcodeparameters.Output.Display display;
        protected Transcodeparameters.Output.Attributes attributes;
        protected Boolean singlepass;
        @XmlAttribute(name = "conversion", required = true)
        protected String conversion;
        @XmlAttribute(name = "template")
        protected String template;

        /**
         * Ruft den Wert der audio-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Transcodeparameters.Output.Audio }
         *     
         */
        public Transcodeparameters.Output.Audio getAudio() {
            return audio;
        }

        /**
         * Legt den Wert der audio-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Transcodeparameters.Output.Audio }
         *     
         */
        public void setAudio(Transcodeparameters.Output.Audio value) {
            this.audio = value;
        }

        /**
         * Ruft den Wert der captions-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Transcodeparameters.Output.Captions }
         *     
         */
        public Transcodeparameters.Output.Captions getCaptions() {
            return captions;
        }

        /**
         * Legt den Wert der captions-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Transcodeparameters.Output.Captions }
         *     
         */
        public void setCaptions(Transcodeparameters.Output.Captions value) {
            this.captions = value;
        }

        /**
         * Ruft den Wert der stlcaptions-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Transcodeparameters.Output.Stlcaptions }
         *     
         */
        public Transcodeparameters.Output.Stlcaptions getStlcaptions() {
            return stlcaptions;
        }

        /**
         * Legt den Wert der stlcaptions-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Transcodeparameters.Output.Stlcaptions }
         *     
         */
        public void setStlcaptions(Transcodeparameters.Output.Stlcaptions value) {
            this.stlcaptions = value;
        }

        /**
         * Ruft den Wert der starttimecode-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStarttimecode() {
            return starttimecode;
        }

        /**
         * Legt den Wert der starttimecode-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStarttimecode(String value) {
            this.starttimecode = value;
        }

        /**
         * Ruft den Wert der anchortimecode-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAnchortimecode() {
            return anchortimecode;
        }

        /**
         * Legt den Wert der anchortimecode-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnchortimecode(String value) {
            this.anchortimecode = value;
        }

        /**
         * Ruft den Wert der watermark-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Transcodeparameters.Output.Watermark }
         *     
         */
        public Transcodeparameters.Output.Watermark getWatermark() {
            return watermark;
        }

        /**
         * Legt den Wert der watermark-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Transcodeparameters.Output.Watermark }
         *     
         */
        public void setWatermark(Transcodeparameters.Output.Watermark value) {
            this.watermark = value;
        }

        /**
         * Ruft den Wert der overlays-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Transcodeparameters.Output.Overlays }
         *     
         */
        public Transcodeparameters.Output.Overlays getOverlays() {
            return overlays;
        }

        /**
         * Legt den Wert der overlays-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Transcodeparameters.Output.Overlays }
         *     
         */
        public void setOverlays(Transcodeparameters.Output.Overlays value) {
            this.overlays = value;
        }

        /**
         * Ruft den Wert der directory-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Transcodeparameters.Output.Directory }
         *     
         */
        public Transcodeparameters.Output.Directory getDirectory() {
            return directory;
        }

        /**
         * Legt den Wert der directory-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Transcodeparameters.Output.Directory }
         *     
         */
        public void setDirectory(Transcodeparameters.Output.Directory value) {
            this.directory = value;
        }

        /**
         * Ruft den Wert der file-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Transcodeparameters.Output.File }
         *     
         */
        public Transcodeparameters.Output.File getFile() {
            return file;
        }

        /**
         * Legt den Wert der file-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Transcodeparameters.Output.File }
         *     
         */
        public void setFile(Transcodeparameters.Output.File value) {
            this.file = value;
        }

        /**
         * Ruft den Wert der containersize-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContainersize() {
            return containersize;
        }

        /**
         * Legt den Wert der containersize-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContainersize(String value) {
            this.containersize = value;
        }

        /**
         * Ruft den Wert der display-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Transcodeparameters.Output.Display }
         *     
         */
        public Transcodeparameters.Output.Display getDisplay() {
            return display;
        }

        /**
         * Legt den Wert der display-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Transcodeparameters.Output.Display }
         *     
         */
        public void setDisplay(Transcodeparameters.Output.Display value) {
            this.display = value;
        }

        /**
         * Ruft den Wert der attributes-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Transcodeparameters.Output.Attributes }
         *     
         */
        public Transcodeparameters.Output.Attributes getAttributes() {
            return attributes;
        }

        /**
         * Legt den Wert der attributes-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Transcodeparameters.Output.Attributes }
         *     
         */
        public void setAttributes(Transcodeparameters.Output.Attributes value) {
            this.attributes = value;
        }

        /**
         * Ruft den Wert der singlepass-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSinglepass() {
            return singlepass;
        }

        /**
         * Legt den Wert der singlepass-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSinglepass(Boolean value) {
            this.singlepass = value;
        }

        /**
         * Ruft den Wert der conversion-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConversion() {
            return conversion;
        }

        /**
         * Legt den Wert der conversion-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConversion(String value) {
            this.conversion = value;
        }

        /**
         * Ruft den Wert der template-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTemplate() {
            return template;
        }

        /**
         * Legt den Wert der template-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTemplate(String value) {
            this.template = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="attribute" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                 &lt;/sequence>
         *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "attribute"
        })
        public static class Attributes {

            @XmlElement(required = true)
            protected List<Transcodeparameters.Output.Attributes.Attribute> attribute;

            /**
             * Gets the value of the attribute property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the attribute property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAttribute().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Transcodeparameters.Output.Attributes.Attribute }
             * 
             * 
             */
            public List<Transcodeparameters.Output.Attributes.Attribute> getAttribute() {
                if (attribute == null) {
                    attribute = new ArrayList<Transcodeparameters.Output.Attributes.Attribute>();
                }
                return this.attribute;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *       &lt;/sequence>
             *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Attribute {

                @XmlAttribute(name = "name", required = true)
                protected String name;
                @XmlAttribute(name = "value", required = true)
                protected String value;

                /**
                 * Ruft den Wert der name-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Legt den Wert der name-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="group" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *                   &lt;element name="channelgroup" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="attributes" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="attribute" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="attributes" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="attribute" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="gain" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="limiter" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="samplerate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="resamplequality" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="bitwidth" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "group"
        })
        public static class Audio {

            @XmlElement(nillable = true)
            protected List<Transcodeparameters.Output.Audio.Group> group;

            /**
             * Gets the value of the group property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the group property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Transcodeparameters.Output.Audio.Group }
             * 
             * 
             */
            public List<Transcodeparameters.Output.Audio.Group> getGroup() {
                if (group == null) {
                    group = new ArrayList<Transcodeparameters.Output.Audio.Group>();
                }
                return this.group;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
             *         &lt;element name="channelgroup" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="attributes" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="attribute" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="attributes" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="attribute" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                           &lt;/sequence>
             *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="gain" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="limiter" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="samplerate" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="resamplequality" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="bitwidth" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "channel",
                "channelgroup",
                "attributes"
            })
            public static class Group {

                @XmlElement(required = true)
                protected List<String> channel;
                @XmlElement(nillable = true)
                protected List<Transcodeparameters.Output.Audio.Group.Channelgroup> channelgroup;
                protected Transcodeparameters.Output.Audio.Group.Attributes attributes;
                @XmlAttribute(name = "id", required = true)
                protected String id;
                @XmlAttribute(name = "type")
                protected String type;
                @XmlAttribute(name = "gain")
                protected String gain;
                @XmlAttribute(name = "limiter")
                protected String limiter;
                @XmlAttribute(name = "samplerate")
                protected String samplerate;
                @XmlAttribute(name = "resamplequality")
                protected String resamplequality;
                @XmlAttribute(name = "bitwidth")
                protected String bitwidth;
                @XmlAttribute(name = "encoding")
                protected String encoding;
                @XmlAttribute(name = "bitrate")
                protected String bitrate;
                @XmlAttribute(name = "mode")
                protected String mode;

                /**
                 * Gets the value of the channel property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the channel property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getChannel().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getChannel() {
                    if (channel == null) {
                        channel = new ArrayList<String>();
                    }
                    return this.channel;
                }

                /**
                 * Gets the value of the channelgroup property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the channelgroup property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getChannelgroup().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Transcodeparameters.Output.Audio.Group.Channelgroup }
                 * 
                 * 
                 */
                public List<Transcodeparameters.Output.Audio.Group.Channelgroup> getChannelgroup() {
                    if (channelgroup == null) {
                        channelgroup = new ArrayList<Transcodeparameters.Output.Audio.Group.Channelgroup>();
                    }
                    return this.channelgroup;
                }

                /**
                 * Ruft den Wert der attributes-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Transcodeparameters.Output.Audio.Group.Attributes }
                 *     
                 */
                public Transcodeparameters.Output.Audio.Group.Attributes getAttributes() {
                    return attributes;
                }

                /**
                 * Legt den Wert der attributes-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Transcodeparameters.Output.Audio.Group.Attributes }
                 *     
                 */
                public void setAttributes(Transcodeparameters.Output.Audio.Group.Attributes value) {
                    this.attributes = value;
                }

                /**
                 * Ruft den Wert der id-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Legt den Wert der id-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                /**
                 * Ruft den Wert der type-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Legt den Wert der type-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Ruft den Wert der gain-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGain() {
                    return gain;
                }

                /**
                 * Legt den Wert der gain-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGain(String value) {
                    this.gain = value;
                }

                /**
                 * Ruft den Wert der limiter-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLimiter() {
                    return limiter;
                }

                /**
                 * Legt den Wert der limiter-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLimiter(String value) {
                    this.limiter = value;
                }

                /**
                 * Ruft den Wert der samplerate-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSamplerate() {
                    return samplerate;
                }

                /**
                 * Legt den Wert der samplerate-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSamplerate(String value) {
                    this.samplerate = value;
                }

                /**
                 * Ruft den Wert der resamplequality-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getResamplequality() {
                    return resamplequality;
                }

                /**
                 * Legt den Wert der resamplequality-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setResamplequality(String value) {
                    this.resamplequality = value;
                }

                /**
                 * Ruft den Wert der bitwidth-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBitwidth() {
                    return bitwidth;
                }

                /**
                 * Legt den Wert der bitwidth-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBitwidth(String value) {
                    this.bitwidth = value;
                }

                /**
                 * Ruft den Wert der encoding-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEncoding() {
                    return encoding;
                }

                /**
                 * Legt den Wert der encoding-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEncoding(String value) {
                    this.encoding = value;
                }

                /**
                 * Ruft den Wert der bitrate-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBitrate() {
                    return bitrate;
                }

                /**
                 * Legt den Wert der bitrate-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBitrate(String value) {
                    this.bitrate = value;
                }

                /**
                 * Ruft den Wert der mode-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMode() {
                    return mode;
                }

                /**
                 * Legt den Wert der mode-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMode(String value) {
                    this.mode = value;
                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="attribute" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "attribute"
                })
                public static class Attributes {

                    @XmlElement(required = true)
                    protected List<Transcodeparameters.Output.Audio.Group.Attributes.Attribute> attribute;

                    /**
                     * Gets the value of the attribute property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the attribute property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAttribute().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Transcodeparameters.Output.Audio.Group.Attributes.Attribute }
                     * 
                     * 
                     */
                    public List<Transcodeparameters.Output.Audio.Group.Attributes.Attribute> getAttribute() {
                        if (attribute == null) {
                            attribute = new ArrayList<Transcodeparameters.Output.Audio.Group.Attributes.Attribute>();
                        }
                        return this.attribute;
                    }


                    /**
                     * <p>Java-Klasse für anonymous complex type.
                     * 
                     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *       &lt;/sequence>
                     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Attribute {

                        @XmlAttribute(name = "name", required = true)
                        protected String name;
                        @XmlAttribute(name = "value", required = true)
                        protected String value;

                        /**
                         * Ruft den Wert der name-Eigenschaft ab.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getName() {
                            return name;
                        }

                        /**
                         * Legt den Wert der name-Eigenschaft fest.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setName(String value) {
                            this.name = value;
                        }

                        /**
                         * Ruft den Wert der value-Eigenschaft ab.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Legt den Wert der value-Eigenschaft fest.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                    }

                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="attributes" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="attribute" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "attributes"
                })
                public static class Channelgroup {

                    protected Transcodeparameters.Output.Audio.Group.Channelgroup.Attributes attributes;
                    @XmlAttribute(name = "id", required = true)
                    protected String id;

                    /**
                     * Ruft den Wert der attributes-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Transcodeparameters.Output.Audio.Group.Channelgroup.Attributes }
                     *     
                     */
                    public Transcodeparameters.Output.Audio.Group.Channelgroup.Attributes getAttributes() {
                        return attributes;
                    }

                    /**
                     * Legt den Wert der attributes-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Transcodeparameters.Output.Audio.Group.Channelgroup.Attributes }
                     *     
                     */
                    public void setAttributes(Transcodeparameters.Output.Audio.Group.Channelgroup.Attributes value) {
                        this.attributes = value;
                    }

                    /**
                     * Ruft den Wert der id-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getId() {
                        return id;
                    }

                    /**
                     * Legt den Wert der id-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setId(String value) {
                        this.id = value;
                    }


                    /**
                     * <p>Java-Klasse für anonymous complex type.
                     * 
                     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="attribute" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "attribute"
                    })
                    public static class Attributes {

                        @XmlElement(required = true)
                        protected List<Transcodeparameters.Output.Audio.Group.Channelgroup.Attributes.Attribute> attribute;

                        /**
                         * Gets the value of the attribute property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the attribute property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getAttribute().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Transcodeparameters.Output.Audio.Group.Channelgroup.Attributes.Attribute }
                         * 
                         * 
                         */
                        public List<Transcodeparameters.Output.Audio.Group.Channelgroup.Attributes.Attribute> getAttribute() {
                            if (attribute == null) {
                                attribute = new ArrayList<Transcodeparameters.Output.Audio.Group.Channelgroup.Attributes.Attribute>();
                            }
                            return this.attribute;
                        }


                        /**
                         * <p>Java-Klasse für anonymous complex type.
                         * 
                         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *       &lt;/sequence>
                         *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Attribute {

                            @XmlAttribute(name = "name", required = true)
                            protected String name;
                            @XmlAttribute(name = "value", required = true)
                            protected String value;

                            /**
                             * Ruft den Wert der name-Eigenschaft ab.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getName() {
                                return name;
                            }

                            /**
                             * Legt den Wert der name-Eigenschaft fest.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setName(String value) {
                                this.name = value;
                            }

                            /**
                             * Ruft den Wert der value-Eigenschaft ab.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getValue() {
                                return value;
                            }

                            /**
                             * Legt den Wert der value-Eigenschaft fest.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setValue(String value) {
                                this.value = value;
                            }

                        }

                    }

                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="stream" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *         &lt;element name="caption" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                 &lt;/sequence>
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="parameters" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "stream",
            "caption"
        })
        public static class Captions {

            @XmlElement(required = true)
            protected List<String> stream;
            @XmlElement(nillable = true)
            protected List<Transcodeparameters.Output.Captions.Caption> caption;
            @XmlAttribute(name = "type")
            protected String type;

            /**
             * Gets the value of the stream property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the stream property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStream().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getStream() {
                if (stream == null) {
                    stream = new ArrayList<String>();
                }
                return this.stream;
            }

            /**
             * Gets the value of the caption property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the caption property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCaption().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Transcodeparameters.Output.Captions.Caption }
             * 
             * 
             */
            public List<Transcodeparameters.Output.Captions.Caption> getCaption() {
                if (caption == null) {
                    caption = new ArrayList<Transcodeparameters.Output.Captions.Caption>();
                }
                return this.caption;
            }

            /**
             * Ruft den Wert der type-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Legt den Wert der type-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *       &lt;/sequence>
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="parameters" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Caption {

                @XmlAttribute(name = "type")
                protected String type;
                @XmlAttribute(name = "parameters")
                protected String parameters;

                /**
                 * Ruft den Wert der type-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Legt den Wert der type-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Ruft den Wert der parameters-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getParameters() {
                    return parameters;
                }

                /**
                 * Legt den Wert der parameters-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setParameters(String value) {
                    this.parameters = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Directory {

            @XmlAttribute(name = "name")
            protected String name;

            /**
             * Ruft den Wert der name-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Legt den Wert der name-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="size" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                 &lt;/sequence>
         *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="offset" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                 &lt;/sequence>
         *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="aspectratio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="border" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "size",
            "offset",
            "aspectratio",
            "border"
        })
        public static class Display {

            protected Transcodeparameters.Output.Display.Size size;
            protected Transcodeparameters.Output.Display.Offset offset;
            protected String aspectratio;
            protected String border;

            /**
             * Ruft den Wert der size-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Transcodeparameters.Output.Display.Size }
             *     
             */
            public Transcodeparameters.Output.Display.Size getSize() {
                return size;
            }

            /**
             * Legt den Wert der size-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Transcodeparameters.Output.Display.Size }
             *     
             */
            public void setSize(Transcodeparameters.Output.Display.Size value) {
                this.size = value;
            }

            /**
             * Ruft den Wert der offset-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Transcodeparameters.Output.Display.Offset }
             *     
             */
            public Transcodeparameters.Output.Display.Offset getOffset() {
                return offset;
            }

            /**
             * Legt den Wert der offset-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Transcodeparameters.Output.Display.Offset }
             *     
             */
            public void setOffset(Transcodeparameters.Output.Display.Offset value) {
                this.offset = value;
            }

            /**
             * Ruft den Wert der aspectratio-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAspectratio() {
                return aspectratio;
            }

            /**
             * Legt den Wert der aspectratio-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAspectratio(String value) {
                this.aspectratio = value;
            }

            /**
             * Ruft den Wert der border-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBorder() {
                return border;
            }

            /**
             * Legt den Wert der border-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBorder(String value) {
                this.border = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *       &lt;/sequence>
             *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Offset {

                @XmlAttribute(name = "height")
                protected Integer height;
                @XmlAttribute(name = "width")
                protected Integer width;

                /**
                 * Ruft den Wert der height-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getHeight() {
                    return height;
                }

                /**
                 * Legt den Wert der height-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setHeight(Integer value) {
                    this.height = value;
                }

                /**
                 * Ruft den Wert der width-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getWidth() {
                    return width;
                }

                /**
                 * Legt den Wert der width-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setWidth(Integer value) {
                    this.width = value;
                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *       &lt;/sequence>
             *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Size {

                @XmlAttribute(name = "height")
                protected Integer height;
                @XmlAttribute(name = "width")
                protected Integer width;

                /**
                 * Ruft den Wert der height-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getHeight() {
                    return height;
                }

                /**
                 * Legt den Wert der height-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setHeight(Integer value) {
                    this.height = value;
                }

                /**
                 * Ruft den Wert der width-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getWidth() {
                    return width;
                }

                /**
                 * Legt den Wert der width-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setWidth(Integer value) {
                    this.width = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class File {

            @XmlAttribute(name = "name")
            protected String name;

            /**
             * Ruft den Wert der name-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Legt den Wert der name-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="timecode" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="font" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="fontsize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="fillbackground" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="segments" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="text" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="colour">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                           &lt;/sequence>
         *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="backgroundcolour">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                           &lt;/sequence>
         *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="opacity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="font" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="fontsize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="fontstyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="horizontalalignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="verticalalignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="segments" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="logo" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="file">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                           &lt;/sequence>
         *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="opacity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="prekeyed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="alphapresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="segments" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "timecode",
            "text",
            "logo"
        })
        public static class Overlays {

            @XmlElement(nillable = true)
            protected List<Transcodeparameters.Output.Overlays.Timecode> timecode;
            @XmlElement(nillable = true)
            protected List<Transcodeparameters.Output.Overlays.Text> text;
            @XmlElement(nillable = true)
            protected List<Transcodeparameters.Output.Overlays.Logo> logo;

            /**
             * Gets the value of the timecode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the timecode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTimecode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Transcodeparameters.Output.Overlays.Timecode }
             * 
             * 
             */
            public List<Transcodeparameters.Output.Overlays.Timecode> getTimecode() {
                if (timecode == null) {
                    timecode = new ArrayList<Transcodeparameters.Output.Overlays.Timecode>();
                }
                return this.timecode;
            }

            /**
             * Gets the value of the text property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the text property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getText().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Transcodeparameters.Output.Overlays.Text }
             * 
             * 
             */
            public List<Transcodeparameters.Output.Overlays.Text> getText() {
                if (text == null) {
                    text = new ArrayList<Transcodeparameters.Output.Overlays.Text>();
                }
                return this.text;
            }

            /**
             * Gets the value of the logo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the logo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLogo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Transcodeparameters.Output.Overlays.Logo }
             * 
             * 
             */
            public List<Transcodeparameters.Output.Overlays.Logo> getLogo() {
                if (logo == null) {
                    logo = new ArrayList<Transcodeparameters.Output.Overlays.Logo>();
                }
                return this.logo;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="file">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                 &lt;/sequence>
             *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="opacity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="prekeyed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="alphapresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="segments" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "file",
                "position",
                "size",
                "opacity",
                "prekeyed",
                "alphapresent",
                "segments"
            })
            public static class Logo {

                @XmlElement(required = true)
                protected Transcodeparameters.Output.Overlays.Logo.File file;
                protected String position;
                protected String size;
                protected BigDecimal opacity;
                protected Boolean prekeyed;
                protected Boolean alphapresent;
                protected Transcodeparameters.Output.Overlays.Logo.Segments segments;

                /**
                 * Ruft den Wert der file-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Transcodeparameters.Output.Overlays.Logo.File }
                 *     
                 */
                public Transcodeparameters.Output.Overlays.Logo.File getFile() {
                    return file;
                }

                /**
                 * Legt den Wert der file-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Transcodeparameters.Output.Overlays.Logo.File }
                 *     
                 */
                public void setFile(Transcodeparameters.Output.Overlays.Logo.File value) {
                    this.file = value;
                }

                /**
                 * Ruft den Wert der position-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPosition() {
                    return position;
                }

                /**
                 * Legt den Wert der position-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPosition(String value) {
                    this.position = value;
                }

                /**
                 * Ruft den Wert der size-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSize() {
                    return size;
                }

                /**
                 * Legt den Wert der size-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSize(String value) {
                    this.size = value;
                }

                /**
                 * Ruft den Wert der opacity-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getOpacity() {
                    return opacity;
                }

                /**
                 * Legt den Wert der opacity-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setOpacity(BigDecimal value) {
                    this.opacity = value;
                }

                /**
                 * Ruft den Wert der prekeyed-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isPrekeyed() {
                    return prekeyed;
                }

                /**
                 * Legt den Wert der prekeyed-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setPrekeyed(Boolean value) {
                    this.prekeyed = value;
                }

                /**
                 * Ruft den Wert der alphapresent-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isAlphapresent() {
                    return alphapresent;
                }

                /**
                 * Legt den Wert der alphapresent-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setAlphapresent(Boolean value) {
                    this.alphapresent = value;
                }

                /**
                 * Ruft den Wert der segments-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Transcodeparameters.Output.Overlays.Logo.Segments }
                 *     
                 */
                public Transcodeparameters.Output.Overlays.Logo.Segments getSegments() {
                    return segments;
                }

                /**
                 * Legt den Wert der segments-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Transcodeparameters.Output.Overlays.Logo.Segments }
                 *     
                 */
                public void setSegments(Transcodeparameters.Output.Overlays.Logo.Segments value) {
                    this.segments = value;
                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *       &lt;/sequence>
                 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class File {

                    @XmlAttribute(name = "name")
                    protected String name;

                    /**
                     * Ruft den Wert der name-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Legt den Wert der name-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "segment"
                })
                public static class Segments {

                    @XmlElement(nillable = true)
                    protected List<String> segment;

                    /**
                     * Gets the value of the segment property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the segment property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSegment().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getSegment() {
                        if (segment == null) {
                            segment = new ArrayList<String>();
                        }
                        return this.segment;
                    }

                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="colour">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                 &lt;/sequence>
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="backgroundcolour">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                 &lt;/sequence>
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="opacity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="font" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="fontsize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="fontstyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="horizontalalignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="verticalalignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="segments" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "text",
                "colour",
                "backgroundcolour",
                "opacity",
                "font",
                "fontsize",
                "fontstyle",
                "position",
                "size",
                "horizontalalignment",
                "verticalalignment",
                "segments"
            })
            public static class Text {

                protected String text;
                @XmlElement(required = true)
                protected Transcodeparameters.Output.Overlays.Text.Colour colour;
                @XmlElement(required = true)
                protected Transcodeparameters.Output.Overlays.Text.Backgroundcolour backgroundcolour;
                protected BigDecimal opacity;
                protected String font;
                protected BigInteger fontsize;
                protected String fontstyle;
                protected String position;
                protected String size;
                protected String horizontalalignment;
                protected String verticalalignment;
                protected Transcodeparameters.Output.Overlays.Text.Segments segments;

                /**
                 * Ruft den Wert der text-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getText() {
                    return text;
                }

                /**
                 * Legt den Wert der text-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setText(String value) {
                    this.text = value;
                }

                /**
                 * Ruft den Wert der colour-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Transcodeparameters.Output.Overlays.Text.Colour }
                 *     
                 */
                public Transcodeparameters.Output.Overlays.Text.Colour getColour() {
                    return colour;
                }

                /**
                 * Legt den Wert der colour-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Transcodeparameters.Output.Overlays.Text.Colour }
                 *     
                 */
                public void setColour(Transcodeparameters.Output.Overlays.Text.Colour value) {
                    this.colour = value;
                }

                /**
                 * Ruft den Wert der backgroundcolour-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Transcodeparameters.Output.Overlays.Text.Backgroundcolour }
                 *     
                 */
                public Transcodeparameters.Output.Overlays.Text.Backgroundcolour getBackgroundcolour() {
                    return backgroundcolour;
                }

                /**
                 * Legt den Wert der backgroundcolour-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Transcodeparameters.Output.Overlays.Text.Backgroundcolour }
                 *     
                 */
                public void setBackgroundcolour(Transcodeparameters.Output.Overlays.Text.Backgroundcolour value) {
                    this.backgroundcolour = value;
                }

                /**
                 * Ruft den Wert der opacity-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getOpacity() {
                    return opacity;
                }

                /**
                 * Legt den Wert der opacity-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setOpacity(BigDecimal value) {
                    this.opacity = value;
                }

                /**
                 * Ruft den Wert der font-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFont() {
                    return font;
                }

                /**
                 * Legt den Wert der font-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFont(String value) {
                    this.font = value;
                }

                /**
                 * Ruft den Wert der fontsize-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getFontsize() {
                    return fontsize;
                }

                /**
                 * Legt den Wert der fontsize-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setFontsize(BigInteger value) {
                    this.fontsize = value;
                }

                /**
                 * Ruft den Wert der fontstyle-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFontstyle() {
                    return fontstyle;
                }

                /**
                 * Legt den Wert der fontstyle-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFontstyle(String value) {
                    this.fontstyle = value;
                }

                /**
                 * Ruft den Wert der position-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPosition() {
                    return position;
                }

                /**
                 * Legt den Wert der position-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPosition(String value) {
                    this.position = value;
                }

                /**
                 * Ruft den Wert der size-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSize() {
                    return size;
                }

                /**
                 * Legt den Wert der size-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSize(String value) {
                    this.size = value;
                }

                /**
                 * Ruft den Wert der horizontalalignment-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHorizontalalignment() {
                    return horizontalalignment;
                }

                /**
                 * Legt den Wert der horizontalalignment-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHorizontalalignment(String value) {
                    this.horizontalalignment = value;
                }

                /**
                 * Ruft den Wert der verticalalignment-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVerticalalignment() {
                    return verticalalignment;
                }

                /**
                 * Legt den Wert der verticalalignment-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVerticalalignment(String value) {
                    this.verticalalignment = value;
                }

                /**
                 * Ruft den Wert der segments-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Transcodeparameters.Output.Overlays.Text.Segments }
                 *     
                 */
                public Transcodeparameters.Output.Overlays.Text.Segments getSegments() {
                    return segments;
                }

                /**
                 * Legt den Wert der segments-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Transcodeparameters.Output.Overlays.Text.Segments }
                 *     
                 */
                public void setSegments(Transcodeparameters.Output.Overlays.Text.Segments value) {
                    this.segments = value;
                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *       &lt;/sequence>
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Backgroundcolour {

                    @XmlAttribute(name = "value")
                    protected String value;

                    /**
                     * Ruft den Wert der value-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Legt den Wert der value-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *       &lt;/sequence>
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Colour {

                    @XmlAttribute(name = "value")
                    protected String value;

                    /**
                     * Ruft den Wert der value-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Legt den Wert der value-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "segment"
                })
                public static class Segments {

                    @XmlElement(nillable = true)
                    protected List<String> segment;

                    /**
                     * Gets the value of the segment property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the segment property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSegment().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getSegment() {
                        if (segment == null) {
                            segment = new ArrayList<String>();
                        }
                        return this.segment;
                    }

                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="font" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="fontsize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="fillbackground" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="segments" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "font",
                "fontsize",
                "position",
                "size",
                "fillbackground",
                "segments"
            })
            public static class Timecode {

                protected String font;
                protected BigInteger fontsize;
                protected String position;
                protected String size;
                protected Boolean fillbackground;
                protected Transcodeparameters.Output.Overlays.Timecode.Segments segments;

                /**
                 * Ruft den Wert der font-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFont() {
                    return font;
                }

                /**
                 * Legt den Wert der font-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFont(String value) {
                    this.font = value;
                }

                /**
                 * Ruft den Wert der fontsize-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getFontsize() {
                    return fontsize;
                }

                /**
                 * Legt den Wert der fontsize-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setFontsize(BigInteger value) {
                    this.fontsize = value;
                }

                /**
                 * Ruft den Wert der position-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPosition() {
                    return position;
                }

                /**
                 * Legt den Wert der position-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPosition(String value) {
                    this.position = value;
                }

                /**
                 * Ruft den Wert der size-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSize() {
                    return size;
                }

                /**
                 * Legt den Wert der size-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSize(String value) {
                    this.size = value;
                }

                /**
                 * Ruft den Wert der fillbackground-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isFillbackground() {
                    return fillbackground;
                }

                /**
                 * Legt den Wert der fillbackground-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setFillbackground(Boolean value) {
                    this.fillbackground = value;
                }

                /**
                 * Ruft den Wert der segments-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Transcodeparameters.Output.Overlays.Timecode.Segments }
                 *     
                 */
                public Transcodeparameters.Output.Overlays.Timecode.Segments getSegments() {
                    return segments;
                }

                /**
                 * Legt den Wert der segments-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Transcodeparameters.Output.Overlays.Timecode.Segments }
                 *     
                 */
                public void setSegments(Transcodeparameters.Output.Overlays.Timecode.Segments value) {
                    this.segments = value;
                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "segment"
                })
                public static class Segments {

                    @XmlElement(nillable = true)
                    protected List<String> segment;

                    /**
                     * Gets the value of the segment property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the segment property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSegment().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getSegment() {
                        if (segment == null) {
                            segment = new ArrayList<String>();
                        }
                        return this.segment;
                    }

                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="stream" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                 &lt;/sequence>
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="line" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="output" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "stream"
        })
        public static class Stlcaptions {

            @XmlElement(required = true)
            protected List<Transcodeparameters.Output.Stlcaptions.Stream> stream;

            /**
             * Gets the value of the stream property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the stream property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStream().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Transcodeparameters.Output.Stlcaptions.Stream }
             * 
             * 
             */
            public List<Transcodeparameters.Output.Stlcaptions.Stream> getStream() {
                if (stream == null) {
                    stream = new ArrayList<Transcodeparameters.Output.Stlcaptions.Stream>();
                }
                return this.stream;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *       &lt;/sequence>
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="line" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="output" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Stream {

                @XmlAttribute(name = "id")
                protected String id;
                @XmlAttribute(name = "page")
                protected BigInteger page;
                @XmlAttribute(name = "line")
                protected BigInteger line;
                @XmlAttribute(name = "mode")
                protected String mode;
                @XmlAttribute(name = "output")
                protected String output;

                /**
                 * Ruft den Wert der id-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Legt den Wert der id-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                /**
                 * Ruft den Wert der page-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getPage() {
                    return page;
                }

                /**
                 * Legt den Wert der page-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setPage(BigInteger value) {
                    this.page = value;
                }

                /**
                 * Ruft den Wert der line-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getLine() {
                    return line;
                }

                /**
                 * Legt den Wert der line-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setLine(BigInteger value) {
                    this.line = value;
                }

                /**
                 * Ruft den Wert der mode-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMode() {
                    return mode;
                }

                /**
                 * Legt den Wert der mode-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMode(String value) {
                    this.mode = value;
                }

                /**
                 * Ruft den Wert der output-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOutput() {
                    return output;
                }

                /**
                 * Legt den Wert der output-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOutput(String value) {
                    this.output = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="teletraxlogging" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="customerid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="itemid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="slug" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="file" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="payload" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="teletraxlocation" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="teletraxprogramname" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="teletraxdb" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "teletraxlogging"
        })
        public static class Watermark {

            protected Transcodeparameters.Output.Watermark.Teletraxlogging teletraxlogging;
            @XmlAttribute(name = "type", required = true)
            protected String type;
            @XmlAttribute(name = "payload")
            protected String payload;
            @XmlAttribute(name = "index")
            protected String index;
            @XmlAttribute(name = "teletraxlocation")
            protected String teletraxlocation;
            @XmlAttribute(name = "teletraxprogramname")
            protected String teletraxprogramname;
            @XmlAttribute(name = "teletraxdb")
            protected String teletraxdb;

            /**
             * Ruft den Wert der teletraxlogging-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Transcodeparameters.Output.Watermark.Teletraxlogging }
             *     
             */
            public Transcodeparameters.Output.Watermark.Teletraxlogging getTeletraxlogging() {
                return teletraxlogging;
            }

            /**
             * Legt den Wert der teletraxlogging-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Transcodeparameters.Output.Watermark.Teletraxlogging }
             *     
             */
            public void setTeletraxlogging(Transcodeparameters.Output.Watermark.Teletraxlogging value) {
                this.teletraxlogging = value;
            }

            /**
             * Ruft den Wert der type-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Legt den Wert der type-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Ruft den Wert der payload-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayload() {
                return payload;
            }

            /**
             * Legt den Wert der payload-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayload(String value) {
                this.payload = value;
            }

            /**
             * Ruft den Wert der index-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndex() {
                return index;
            }

            /**
             * Legt den Wert der index-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndex(String value) {
                this.index = value;
            }

            /**
             * Ruft den Wert der teletraxlocation-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTeletraxlocation() {
                return teletraxlocation;
            }

            /**
             * Legt den Wert der teletraxlocation-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTeletraxlocation(String value) {
                this.teletraxlocation = value;
            }

            /**
             * Ruft den Wert der teletraxprogramname-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTeletraxprogramname() {
                return teletraxprogramname;
            }

            /**
             * Legt den Wert der teletraxprogramname-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTeletraxprogramname(String value) {
                this.teletraxprogramname = value;
            }

            /**
             * Ruft den Wert der teletraxdb-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTeletraxdb() {
                return teletraxdb;
            }

            /**
             * Legt den Wert der teletraxdb-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTeletraxdb(String value) {
                this.teletraxdb = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="customerid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="itemid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="slug" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="file" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "customerid",
                "itemid",
                "slug",
                "description"
            })
            public static class Teletraxlogging {

                protected String customerid;
                protected String itemid;
                protected String slug;
                protected String description;
                @XmlAttribute(name = "file", required = true)
                protected String file;

                /**
                 * Ruft den Wert der customerid-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerid() {
                    return customerid;
                }

                /**
                 * Legt den Wert der customerid-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerid(String value) {
                    this.customerid = value;
                }

                /**
                 * Ruft den Wert der itemid-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItemid() {
                    return itemid;
                }

                /**
                 * Legt den Wert der itemid-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItemid(String value) {
                    this.itemid = value;
                }

                /**
                 * Ruft den Wert der slug-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSlug() {
                    return slug;
                }

                /**
                 * Legt den Wert der slug-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSlug(String value) {
                    this.slug = value;
                }

                /**
                 * Ruft den Wert der description-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Legt den Wert der description-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

                /**
                 * Ruft den Wert der file-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFile() {
                    return file;
                }

                /**
                 * Legt den Wert der file-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFile(String value) {
                    this.file = value;
                }

            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="segment" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="input" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="in" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="out" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="attributes" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="attribute" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="anchor" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="timecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "segment",
        "anchor"
    })
    public static class Segments {

        @XmlElement(required = true)
        protected List<Transcodeparameters.Segments.Segment> segment;
        protected Transcodeparameters.Segments.Anchor anchor;
        @XmlAttribute(name = "style")
        protected String style;

        /**
         * Gets the value of the segment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Transcodeparameters.Segments.Segment }
         * 
         * 
         */
        public List<Transcodeparameters.Segments.Segment> getSegment() {
            if (segment == null) {
                segment = new ArrayList<Transcodeparameters.Segments.Segment>();
            }
            return this.segment;
        }

        /**
         * Ruft den Wert der anchor-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Transcodeparameters.Segments.Anchor }
         *     
         */
        public Transcodeparameters.Segments.Anchor getAnchor() {
            return anchor;
        }

        /**
         * Legt den Wert der anchor-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Transcodeparameters.Segments.Anchor }
         *     
         */
        public void setAnchor(Transcodeparameters.Segments.Anchor value) {
            this.anchor = value;
        }

        /**
         * Ruft den Wert der style-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStyle() {
            return style;
        }

        /**
         * Legt den Wert der style-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStyle(String value) {
            this.style = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="timecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "segment",
            "timecode"
        })
        public static class Anchor {

            @XmlElement(required = true)
            protected String segment;
            protected String timecode;

            /**
             * Ruft den Wert der segment-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSegment() {
                return segment;
            }

            /**
             * Legt den Wert der segment-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSegment(String value) {
                this.segment = value;
            }

            /**
             * Ruft den Wert der timecode-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTimecode() {
                return timecode;
            }

            /**
             * Legt den Wert der timecode-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTimecode(String value) {
                this.timecode = value;
            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="input" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="in" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="out" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="attributes" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="attribute" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                           &lt;/sequence>
         *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "input",
            "in",
            "out",
            "attributes"
        })
        public static class Segment {

            @XmlElement(required = true)
            protected String input;
            protected String in;
            protected String out;
            protected Transcodeparameters.Segments.Segment.Attributes attributes;
            @XmlAttribute(name = "id")
            protected String id;

            /**
             * Ruft den Wert der input-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInput() {
                return input;
            }

            /**
             * Legt den Wert der input-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInput(String value) {
                this.input = value;
            }

            /**
             * Ruft den Wert der in-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIn() {
                return in;
            }

            /**
             * Legt den Wert der in-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIn(String value) {
                this.in = value;
            }

            /**
             * Ruft den Wert der out-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOut() {
                return out;
            }

            /**
             * Legt den Wert der out-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOut(String value) {
                this.out = value;
            }

            /**
             * Ruft den Wert der attributes-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Transcodeparameters.Segments.Segment.Attributes }
             *     
             */
            public Transcodeparameters.Segments.Segment.Attributes getAttributes() {
                return attributes;
            }

            /**
             * Legt den Wert der attributes-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Transcodeparameters.Segments.Segment.Attributes }
             *     
             */
            public void setAttributes(Transcodeparameters.Segments.Segment.Attributes value) {
                this.attributes = value;
            }

            /**
             * Ruft den Wert der id-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Legt den Wert der id-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="attribute" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                 &lt;/sequence>
             *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "attribute"
            })
            public static class Attributes {

                @XmlElement(required = true)
                protected List<Transcodeparameters.Segments.Segment.Attributes.Attribute> attribute;

                /**
                 * Gets the value of the attribute property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the attribute property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAttribute().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Transcodeparameters.Segments.Segment.Attributes.Attribute }
                 * 
                 * 
                 */
                public List<Transcodeparameters.Segments.Segment.Attributes.Attribute> getAttribute() {
                    if (attribute == null) {
                        attribute = new ArrayList<Transcodeparameters.Segments.Segment.Attributes.Attribute>();
                    }
                    return this.attribute;
                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *       &lt;/sequence>
                 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Attribute {

                    @XmlAttribute(name = "name", required = true)
                    protected String name;
                    @XmlAttribute(name = "value", required = true)
                    protected String value;

                    /**
                     * Ruft den Wert der name-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Legt den Wert der name-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                    /**
                     * Ruft den Wert der value-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Legt den Wert der value-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                }

            }

        }

    }

}
