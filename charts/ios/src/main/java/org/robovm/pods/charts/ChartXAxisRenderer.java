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
package org.robovm.pods.charts;

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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartXAxisRenderer/*</name>*/ 
    extends /*<extends>*/ChartAxisRendererBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartXAxisRendererPtr extends Ptr<ChartXAxisRenderer, ChartXAxisRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartXAxisRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ChartXAxisRenderer() {}
    protected ChartXAxisRenderer(Handle h, long handle) { super(h, handle); }
    protected ChartXAxisRenderer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithViewPortHandler:xAxis:transformer:")
    public ChartXAxisRenderer(ChartViewPortHandler viewPortHandler, ChartXAxis xAxis, ChartTransformer transformer) { super((SkipInit) null); initObject(init(viewPortHandler, xAxis, transformer)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "gridClippingRect")
    public native @ByVal CGRect getGridClippingRect();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithViewPortHandler:xAxis:transformer:")
    protected native @Pointer long init(ChartViewPortHandler viewPortHandler, ChartXAxis xAxis, ChartTransformer transformer);
    @Method(selector = "computeAxisWithMin:max:inverted:")
    public native void computeAxis(double min, double max, boolean inverted);
    @Method(selector = "computeAxisValuesWithMin:max:")
    public native void computeAxisValues(double min, double max);
    @Method(selector = "computeSize")
    public native void computeSize();
    @Method(selector = "renderAxisLabelsWithContext:")
    public native void renderAxisLabels(CGContext context);
    @Method(selector = "renderAxisLineWithContext:")
    public native void renderAxisLine(CGContext context);
    @Method(selector = "drawLabelsWithContext:pos:anchor:")
    public native void drawLabels(CGContext context, @MachineSizedFloat double pos, @ByVal CGPoint anchor);
    @Method(selector = "drawLabelWithContext:formattedLabel:x:y:attributes:constrainedToSize:anchor:angleRadians:")
    public native void drawLabel(CGContext context, String formattedLabel, @MachineSizedFloat double x, @MachineSizedFloat double y, NSDictionary<NSString, ?> attributes, @ByVal CGSize constrainedToSize, @ByVal CGPoint anchor, @MachineSizedFloat double angleRadians);
    @Method(selector = "renderGridLinesWithContext:")
    public native void renderGridLines(CGContext context);
    @Method(selector = "drawGridLineWithContext:x:y:")
    public native void drawGridLine(CGContext context, @MachineSizedFloat double x, @MachineSizedFloat double y);
    @Method(selector = "renderLimitLinesWithContext:")
    public native void renderLimitLines(CGContext context);
    @Method(selector = "renderLimitLineLineWithContext:limitLine:position:")
    public native void renderLimitLineLine(CGContext context, ChartLimitLine limitLine, @ByVal CGPoint position);
    @Method(selector = "renderLimitLineLabelWithContext:limitLine:position:yOffset:")
    public native void renderLimitLineLabel(CGContext context, ChartLimitLine limitLine, @ByVal CGPoint position, @MachineSizedFloat double yOffset);
    /*</methods>*/
}
