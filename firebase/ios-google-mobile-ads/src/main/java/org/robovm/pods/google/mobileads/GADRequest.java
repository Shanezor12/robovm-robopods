/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.google.mobileads;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADRequestPtr extends Ptr<GADRequest, GADRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADRequest() {}
    protected GADRequest(Handle h, long handle) { super(h, handle); }
    protected GADRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "scene")
    public native UIWindowScene getScene();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setScene:", strongRef = true)
    public native void setScene(UIWindowScene v);
    @Property(selector = "keywords")
    public native NSArray<?> getKeywords();
    @Property(selector = "setKeywords:")
    public native void setKeywords(NSArray<?> v);
    @Property(selector = "contentURL")
    public native String getContentURL();
    @Property(selector = "setContentURL:")
    public native void setContentURL(String v);
    @Property(selector = "neighboringContentURLStrings")
    public native NSArray<NSString> getNeighboringContentURLStrings();
    @Property(selector = "setNeighboringContentURLStrings:")
    public native void setNeighboringContentURLStrings(NSArray<NSString> v);
    @Property(selector = "requestAgent")
    public native String getRequestAgent();
    @Property(selector = "setRequestAgent:")
    public native void setRequestAgent(String v);
    /**
     * @deprecated Use GADMobileAds.sharedInstance.requestConfiguration.testDeviceIdentifiers.
     */
    @Deprecated
    @Property(selector = "testDevices")
    public native NSArray<NSString> getTestDevices();
    /**
     * @deprecated Use GADMobileAds.sharedInstance.requestConfiguration.testDeviceIdentifiers.
     */
    @Deprecated
    @Property(selector = "setTestDevices:")
    public native void setTestDevices(NSArray<NSString> v);
    @Deprecated
    @Property(selector = "gender")
    public native GADGender getGender();
    @Deprecated
    @Property(selector = "setGender:")
    public native void setGender(GADGender v);
    @Deprecated
    @Property(selector = "birthday")
    public native NSDate getBirthday();
    @Deprecated
    @Property(selector = "setBirthday:")
    public native void setBirthday(NSDate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kGADSimulatorID", optional=true)
    public static native NSString GADSimulatorID();
    
    @Method(selector = "registerAdNetworkExtras:")
    public native void registerAdNetworkExtras(GADAdNetworkExtras extras);
    @Method(selector = "adNetworkExtrasFor:")
    public native GADAdNetworkExtras adNetworkExtrasFor(Class<?> aClass);
    @Method(selector = "removeAdNetworkExtrasFor:")
    public native void removeAdNetworkExtrasFor(Class<?> aClass);
    @Method(selector = "setLocationWithLatitude:longitude:accuracy:")
    public native void setLocation(@MachineSizedFloat double latitude, @MachineSizedFloat double longitude, @MachineSizedFloat double accuracyInMeters);
    @Deprecated
    @Method(selector = "setBirthdayWithMonth:day:year:")
    public native void setBirthday(@MachineSizedSInt long month, @MachineSizedSInt long day, @MachineSizedSInt long year);
    /**
     * @deprecated use setLocationWithLatitude:longitude:accuracy:.
     */
    @Deprecated
    @Method(selector = "setLocationWithDescription:")
    public native void setLocation(String locationDescription);
    /**
     * @deprecated use [GADMobileAds.sharedInstance.requestConfiguration tagForChildDirectedTreatment]
     */
    @Deprecated
    @Method(selector = "tagForChildDirectedTreatment:")
    public native void tagForChildDirectedTreatment(boolean childDirectedTreatment);
    @Method(selector = "request")
    public static native GADRequest request();
    /**
     * @deprecated Use GADMobileAds.sharedInstance.sdkVersion
     */
    @Deprecated
    @Method(selector = "sdkVersion")
    public static native String sdkVersion();
    /*</methods>*/
}
