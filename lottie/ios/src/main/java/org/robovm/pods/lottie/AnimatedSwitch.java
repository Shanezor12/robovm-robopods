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
package org.robovm.pods.lottie;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Lottie14AnimatedSwitch")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AnimatedSwitch/*</name>*/ 
    extends /*<extends>*/AnimatedControl/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AnimatedSwitchPtr extends Ptr<AnimatedSwitch, AnimatedSwitchPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AnimatedSwitch.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AnimatedSwitch() {}
    protected AnimatedSwitch(Handle h, long handle) { super(h, handle); }
    protected AnimatedSwitch(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public AnimatedSwitch(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    @Method(selector = "endTrackingWithTouch:withEvent:")
    public native void endTracking(UITouch touch, UIEvent event);
    /*</methods>*/
}
