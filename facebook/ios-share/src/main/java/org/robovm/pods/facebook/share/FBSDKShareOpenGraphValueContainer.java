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
package org.robovm.pods.facebook.share;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.photos.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKShareOpenGraphValueContainer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKShareOpenGraphValueContaining/*</implements>*/ {

    /*<ptr>*/public static class FBSDKShareOpenGraphValueContainerPtr extends Ptr<FBSDKShareOpenGraphValueContainer, FBSDKShareOpenGraphValueContainerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKShareOpenGraphValueContainer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKShareOpenGraphValueContainer() {}
    protected FBSDKShareOpenGraphValueContainer(Handle h, long handle) { super(h, handle); }
    protected FBSDKShareOpenGraphValueContainer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public FBSDKShareOpenGraphValueContainer(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "allProperties")
    public native NSDictionary<NSString, ?> getAllProperties();
    @Property(selector = "keyEnumerator")
    public native NSEnumerator<?> getKeyEnumerator();
    @Property(selector = "objectEnumerator")
    public native NSEnumerator<?> getObjectEnumerator();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "arrayForKey:")
    public native NSArray<?> arrayForKey(String key);
    @Method(selector = "enumerateKeysAndObjectsUsingBlock:")
    public native void enumerateKeysAndObjectsUsingBlock(@Block VoidBlock3<NSString, NSObject, BooleanPtr> block);
    @Method(selector = "numberForKey:")
    public native NSNumber numberForKey(String key);
    @Method(selector = "stringForKey:")
    public native String stringForKey(String key);
    @Method(selector = "URLForKey:")
    public native NSURL URLForKey(String key);
    @Method(selector = "objectForKey:")
    public native FBSDKShareOpenGraphObject objectForKey(String key);
    @Method(selector = "objectForKeyedSubscript:")
    public native NSObject objectForKeyedSubscript(String key);
    @Method(selector = "parseProperties:")
    public native void parseProperties(NSDictionary<NSString, ?> properties);
    @Method(selector = "photoForKey:")
    public native FBSDKSharePhoto photoForKey(String key);
    @Method(selector = "removeObjectForKey:")
    public native void removeObjectForKey(String key);
    @Method(selector = "setArray:forKey:")
    public native void setArray(NSArray<?> array, String key);
    @Method(selector = "setNumber:forKey:")
    public native void setNumber(NSNumber number, String key);
    @Method(selector = "setObject:forKey:")
    public native void setObject(FBSDKShareOpenGraphObject object, String key);
    @Method(selector = "setPhoto:forKey:")
    public native void setPhoto(FBSDKSharePhoto photo, String key);
    @Method(selector = "setString:forKey:")
    public native void setString(String string, String key);
    @Method(selector = "setURL:forKey:")
    public native void setURL(NSURL URL, String key);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
