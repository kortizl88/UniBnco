/**
 * Created by othoniel on 10/29/14.
 */
package containers {
import spark.components.Group;
import spark.components.TitleWindow;

public class UniformesTitleWindow extends TitleWindow {
    [SkinPart]
    public var leftControlGroup:Group;

    [SkinPart]
    public var rightControlGroup:Group;

    private var _leftControlContent:Array = [];
    private var _rightControlContent:Array = [];

    public function UniformesTitleWindow() {
        super();
    }

    [ArrayElementType("mx.core.IVisualElement")]
    public function get leftControlContent():Array {
        return _leftControlContent;
    }

    public function set leftControlContent(value:Array):void {
        _leftControlContent = value;
        if (leftControlGroup) {
            leftControlGroup.mxmlContent = value;
        }
    }

    [ArrayElementType("mx.core.IVisualElement")]
    public function get rightControlContent():Array {
        return _rightControlContent;
    }

    public function set rightControlContent(value:Array):void {
        _rightControlContent = value;
        if (rightControlGroup) {
            rightControlGroup.mxmlContent = value;
        }
    }

    override protected function partAdded(partName:String, instance:Object):void {
        super.partAdded(partName, instance);

        if (instance == rightControlGroup) {
            rightControlGroup.mxmlContent = _rightControlContent;
        }
        if (instance == leftControlGroup) {
            leftControlGroup.mxmlContent = _leftControlContent;
        }
    }

    override protected function partRemoved(partName:String, instance:Object):void {
        super.partRemoved(partName, instance);

        if (instance == rightControlGroup) {
            rightControlGroup.mxmlContent = null;
        }
        if (instance == leftControlGroup) {
            leftControlGroup.mxmlContent = null;
        }
    }
}
}
