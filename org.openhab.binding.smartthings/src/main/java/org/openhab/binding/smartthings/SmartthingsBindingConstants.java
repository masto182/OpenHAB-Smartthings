/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.smartthings;

import java.util.Set;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

import com.google.common.collect.ImmutableSet;

/**
 * The {@link SmartthingsBinding} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Bob Raker - Initial contribution
 */
public class SmartthingsBindingConstants {

    public static final String BINDING_ID = "smartthings";

    // List of Bridge Type UIDs
    public static final ThingTypeUID THING_TYPE_SMARTTHINGS = new ThingTypeUID(BINDING_ID, "smartthings");

    // List of all Thing Type UIDs
    // I tried to replace this with a dynamic processing of the thing-types.xml file using the ThingTypeRegistry
    // But the HandlerFactory wants to start checking on things before that code runs. So, back to a hard coded list
    public static final Set<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = ImmutableSet.of(
            new ThingTypeUID(BINDING_ID, "accelerationSensor"), new ThingTypeUID(BINDING_ID, "alarm"),
            new ThingTypeUID(BINDING_ID, "battery"), new ThingTypeUID(BINDING_ID, "beacon"),
            new ThingTypeUID(BINDING_ID, "bulb"), new ThingTypeUID(BINDING_ID, "button"),
            new ThingTypeUID(BINDING_ID, "carbonDioxideMeasurement"),
            new ThingTypeUID(BINDING_ID, "carbonMonoxideDetector"), new ThingTypeUID(BINDING_ID, "colorControl"),
            new ThingTypeUID(BINDING_ID, "colorTemperature"), new ThingTypeUID(BINDING_ID, "consumable"),
            new ThingTypeUID(BINDING_ID, "contactSensor"), new ThingTypeUID(BINDING_ID, "doorControl"),
            new ThingTypeUID(BINDING_ID, "energyMeter"), new ThingTypeUID(BINDING_ID, "estimatedTimeOfArrival"),
            new ThingTypeUID(BINDING_ID, "garageDoorControl"), new ThingTypeUID(BINDING_ID, "holdableButton"),
            new ThingTypeUID(BINDING_ID, "illuminanceMeasurement"), new ThingTypeUID(BINDING_ID, "imageCapture"),
            new ThingTypeUID(BINDING_ID, "indicator"), new ThingTypeUID(BINDING_ID, "infraredLevel"),
            new ThingTypeUID(BINDING_ID, "light"), new ThingTypeUID(BINDING_ID, "lock"),
            new ThingTypeUID(BINDING_ID, "lockOnly"), new ThingTypeUID(BINDING_ID, "mediaController"),
            new ThingTypeUID(BINDING_ID, "motionSensor"), new ThingTypeUID(BINDING_ID, "musicPlayer"),
            new ThingTypeUID(BINDING_ID, "outlet"), new ThingTypeUID(BINDING_ID, "pHMeasurement"),
            new ThingTypeUID(BINDING_ID, "powerMeter"), new ThingTypeUID(BINDING_ID, "powerSource"),
            new ThingTypeUID(BINDING_ID, "presenceSensor"), new ThingTypeUID(BINDING_ID, "relativeHumidityMeasurement"),
            new ThingTypeUID(BINDING_ID, "relaySwitch"), new ThingTypeUID(BINDING_ID, "shockSensor"),
            new ThingTypeUID(BINDING_ID, "signalStrength"), new ThingTypeUID(BINDING_ID, "sleepSensor"),
            new ThingTypeUID(BINDING_ID, "smokeDetector"), new ThingTypeUID(BINDING_ID, "soundPressureLevel"),
            new ThingTypeUID(BINDING_ID, "soundSensor"), new ThingTypeUID(BINDING_ID, "speechRecognition"),
            new ThingTypeUID(BINDING_ID, "stepSensor"), new ThingTypeUID(BINDING_ID, "switch"),
            new ThingTypeUID(BINDING_ID, "switchLevel"), new ThingTypeUID(BINDING_ID, "tamperAlert"),
            new ThingTypeUID(BINDING_ID, "temperatureMeasurement"), new ThingTypeUID(BINDING_ID, "thermostat"),
            new ThingTypeUID(BINDING_ID, "thermostatCoolingSetpoint"),
            new ThingTypeUID(BINDING_ID, "thermostatFanMode"),
            new ThingTypeUID(BINDING_ID, "thermostatHeatingSetpoint"), new ThingTypeUID(BINDING_ID, "thermostatMode"),
            new ThingTypeUID(BINDING_ID, "thermostatOperatingState"),
            new ThingTypeUID(BINDING_ID, "thermostatSetpoint"), new ThingTypeUID(BINDING_ID, "threeAxis"),
            new ThingTypeUID(BINDING_ID, "timedSession"), new ThingTypeUID(BINDING_ID, "touchSensor"),
            new ThingTypeUID(BINDING_ID, "valve"), new ThingTypeUID(BINDING_ID, "ultravioletIndex"),
            new ThingTypeUID(BINDING_ID, "voltageMeasurement"), new ThingTypeUID(BINDING_ID, "waterSensor"),
            new ThingTypeUID(BINDING_ID, "windowShade"));

    // Event Handler Topics
    public static final String STATE_EVENT_TOPIC = "org/openhab/binding/smartthings/state";
    public static final String DISCOVERY_EVENT_TOPIC = "org/openhab/binding/smartthings/discovery";

}
