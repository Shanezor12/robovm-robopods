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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADInterstitial/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADInterstitialPtr extends Ptr<GADInterstitial, GADInterstitialPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADInterstitial.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADInterstitial() {}
    protected GADInterstitial(Handle h, long handle) { super(h, handle); }
    protected GADInterstitial(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdUnitID:")
    public GADInterstitial(String adUnitID) { super((SkipInit) null); initObject(init(adUnitID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adUnitID")
    public native String getAdUnitID();
    @Property(selector = "setAdUnitID:")
    public native void setAdUnitID(String v);
    @Property(selector = "delegate")
    public native GADInterstitialDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(GADInterstitialDelegate v);
    @Property(selector = "isReady")
    public native boolean isReady();
    @Property(selector = "hasBeenUsed")
    public native boolean hasBeenUsed();
    @Property(selector = "responseInfo")
    public native GADResponseInfo getResponseInfo();
    @Property(selector = "paidEventHandler")
    public native @Block VoidBlock1<GADAdValue> getPaidEventHandler();
    @Property(selector = "setPaidEventHandler:")
    public native void setPaidEventHandler(@Block VoidBlock1<GADAdValue> v);
    @Deprecated
    @Property(selector = "inAppPurchaseDelegate")
    public native GADInAppPurchaseDelegate getInAppPurchaseDelegate();
    @Deprecated
    @Property(selector = "setInAppPurchaseDelegate:", strongRef = true)
    public native void setInAppPurchaseDelegate(GADInAppPurchaseDelegate v);
    /**
     * @deprecated Use responseInfo.adNetworkClassName.
     */
    @Deprecated
    @Property(selector = "adNetworkClassName")
    public native String getAdNetworkClassName();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdUnitID:")
    protected native @Pointer long init(String adUnitID);
    @Method(selector = "loadRequest:")
    public native void loadRequest(GADRequest request);
    @Method(selector = "presentFromRootViewController:")
    public native void presentFromRootViewController(UIViewController rootViewController);
    @Method(selector = "canPresentFromRootViewController:error:")
    public native boolean canPresent(UIViewController rootViewController, NSError.NSErrorPtr error);
    /*</methods>*/
}
