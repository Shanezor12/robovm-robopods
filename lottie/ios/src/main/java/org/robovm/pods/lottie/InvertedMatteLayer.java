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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Lottie18InvertedMatteLayer")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/InvertedMatteLayer/*</name>*/ 
    extends /*<extends>*/CALayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class InvertedMatteLayerPtr extends Ptr<InvertedMatteLayer, InvertedMatteLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(InvertedMatteLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected InvertedMatteLayer() {}
    protected InvertedMatteLayer(Handle h, long handle) { super(h, handle); }
    protected InvertedMatteLayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLayer:")
    public InvertedMatteLayer(NSObject layer) { super((SkipInit) null); initObject(init(layer)); }
    @Method(selector = "initWithCoder:")
    public InvertedMatteLayer(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLayer:")
    protected native @Pointer long init(NSObject layer);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    @Method(selector = "drawInContext:")
    public native void draw(CGContext ctx);
    /*</methods>*/
}
