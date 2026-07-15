package com.ardrawing.ardrawing;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ardrawing.ardrawing.databinding.ActivityDrawingGalleryBindingImpl;
import com.ardrawing.ardrawing.databinding.ActivityDrawingViewerBindingImpl;
import com.ardrawing.ardrawing.databinding.ActivityLessonBindingImpl;
import com.ardrawing.ardrawing.databinding.ActivityLessonStepBindingImpl;
import com.ardrawing.ardrawing.databinding.ItemDrawingBindingImpl;
import com.ardrawing.ardrawing.databinding.ItemGuideBindingImpl;
import com.ardrawing.ardrawing.databinding.ItemLessonBindingImpl;
import com.ardrawing.ardrawing.databinding.ItemLessonStepBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDRAWINGGALLERY = 1;

  private static final int LAYOUT_ACTIVITYDRAWINGVIEWER = 2;

  private static final int LAYOUT_ACTIVITYLESSON = 3;

  private static final int LAYOUT_ACTIVITYLESSONSTEP = 4;

  private static final int LAYOUT_ITEMDRAWING = 5;

  private static final int LAYOUT_ITEMGUIDE = 6;

  private static final int LAYOUT_ITEMLESSON = 7;

  private static final int LAYOUT_ITEMLESSONSTEP = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ardrawing.ardrawing.R.layout.activity_drawing_gallery, LAYOUT_ACTIVITYDRAWINGGALLERY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ardrawing.ardrawing.R.layout.activity_drawing_viewer, LAYOUT_ACTIVITYDRAWINGVIEWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ardrawing.ardrawing.R.layout.activity_lesson, LAYOUT_ACTIVITYLESSON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ardrawing.ardrawing.R.layout.activity_lesson_step, LAYOUT_ACTIVITYLESSONSTEP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ardrawing.ardrawing.R.layout.item_drawing, LAYOUT_ITEMDRAWING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ardrawing.ardrawing.R.layout.item_guide, LAYOUT_ITEMGUIDE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ardrawing.ardrawing.R.layout.item_lesson, LAYOUT_ITEMLESSON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ardrawing.ardrawing.R.layout.item_lesson_step, LAYOUT_ITEMLESSONSTEP);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDRAWINGGALLERY: {
          if ("layout/activity_drawing_gallery_0".equals(tag)) {
            return new ActivityDrawingGalleryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_drawing_gallery is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDRAWINGVIEWER: {
          if ("layout/activity_drawing_viewer_0".equals(tag)) {
            return new ActivityDrawingViewerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_drawing_viewer is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLESSON: {
          if ("layout/activity_lesson_0".equals(tag)) {
            return new ActivityLessonBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_lesson is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLESSONSTEP: {
          if ("layout/activity_lesson_step_0".equals(tag)) {
            return new ActivityLessonStepBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_lesson_step is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDRAWING: {
          if ("layout/item_drawing_0".equals(tag)) {
            return new ItemDrawingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_drawing is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMGUIDE: {
          if ("layout/item_guide_0".equals(tag)) {
            return new ItemGuideBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_guide is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLESSON: {
          if ("layout/item_lesson_0".equals(tag)) {
            return new ItemLessonBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_lesson is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLESSONSTEP: {
          if ("layout/item_lesson_step_0".equals(tag)) {
            return new ItemLessonStepBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_lesson_step is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_drawing_gallery_0", com.ardrawing.ardrawing.R.layout.activity_drawing_gallery);
      sKeys.put("layout/activity_drawing_viewer_0", com.ardrawing.ardrawing.R.layout.activity_drawing_viewer);
      sKeys.put("layout/activity_lesson_0", com.ardrawing.ardrawing.R.layout.activity_lesson);
      sKeys.put("layout/activity_lesson_step_0", com.ardrawing.ardrawing.R.layout.activity_lesson_step);
      sKeys.put("layout/item_drawing_0", com.ardrawing.ardrawing.R.layout.item_drawing);
      sKeys.put("layout/item_guide_0", com.ardrawing.ardrawing.R.layout.item_guide);
      sKeys.put("layout/item_lesson_0", com.ardrawing.ardrawing.R.layout.item_lesson);
      sKeys.put("layout/item_lesson_step_0", com.ardrawing.ardrawing.R.layout.item_lesson_step);
    }
  }
}
