package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.drawable;
import android.util.TypedValue;

public class TintManager
{
  private static final TintManager.ColorFilterLruCache COLOR_FILTER_CACHE;
  private static final int[] CONTAINERS_WITH_TINT_CHILDREN = { R.drawable.abc_cab_background_top_material };
  private static final boolean DEBUG = false;
  static final PorterDuff.Mode DEFAULT_MODE;
  private static final String TAG = TintManager.class.getSimpleName();
  private static final int[] TINT_COLOR_BACKGROUND_MULTIPLY;
  private static final int[] TINT_COLOR_CONTROL_ACTIVATED;
  private static final int[] TINT_COLOR_CONTROL_NORMAL;
  private static final int[] TINT_COLOR_CONTROL_STATE_LIST;
  private final Context mContext;
  private ColorStateList mDefaultColorStateList;
  private final Resources mResources;
  private ColorStateList mSwitchThumbStateList;
  private ColorStateList mSwitchTrackStateList;
  private final TypedValue mTypedValue;
  
  static
  {
    DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    COLOR_FILTER_CACHE = new TintManager.ColorFilterLruCache(6);
    TINT_COLOR_CONTROL_NORMAL = new int[] { R.drawable.abc_ic_ab_back_mtrl_am_alpha, R.drawable.abc_ic_go_search_api_mtrl_alpha, R.drawable.abc_ic_search_api_mtrl_alpha, R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_ic_clear_mtrl_alpha, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha, R.drawable.abc_ic_menu_moreoverflow_mtrl_alpha, R.drawable.abc_ic_voice_search_api_mtrl_alpha, R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha };
    TINT_COLOR_CONTROL_ACTIVATED = new int[] { R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha };
    TINT_COLOR_BACKGROUND_MULTIPLY = new int[] { R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult };
    TINT_COLOR_CONTROL_STATE_LIST = new int[] { R.drawable.abc_edit_text_material, R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material, R.drawable.abc_spinner_mtrl_am_alpha, R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material };
  }
  
  public TintManager(Context paramContext)
  {
    mContext = paramContext;
    mResources = new TintResources(paramContext.getResources(), this);
    mTypedValue = new TypedValue();
  }
  
  private static boolean arrayContains(int[] paramArrayOfInt, int paramInt)
  {
    boolean bool2 = false;
    int j = paramArrayOfInt.length;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        if (paramArrayOfInt[i] == paramInt) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  private ColorStateList getDefaultColorStateList()
  {
    if (mDefaultColorStateList == null)
    {
      int i = getThemeAttrColor(R.attr.colorControlNormal);
      int j = getThemeAttrColor(R.attr.colorControlActivated);
      int k = getDisabledThemeAttrColor(R.attr.colorControlNormal);
      mDefaultColorStateList = new ColorStateList(new int[][] { { -16842910 }, { 16842908 }, { 16843518 }, { 16842919 }, { 16842912 }, { 16842913 }, new int[0] }, new int[] { k, j, j, j, j, j, i });
    }
    return mDefaultColorStateList;
  }
  
  public static Drawable getDrawable(Context paramContext, int paramInt)
  {
    if (isInTintList(paramInt)) {
      return new TintManager(paramContext).getDrawable(paramInt);
    }
    return ContextCompat.getDrawable(paramContext, paramInt);
  }
  
  private ColorStateList getSwitchThumbColorStateList()
  {
    if (mSwitchThumbStateList == null)
    {
      int i = getDisabledThemeAttrColor(R.attr.colorSwitchThumbNormal);
      int j = getThemeAttrColor(R.attr.colorControlActivated);
      int k = getThemeAttrColor(R.attr.colorSwitchThumbNormal);
      mSwitchThumbStateList = new ColorStateList(new int[][] { { -16842910 }, { 16842912 }, new int[0] }, new int[] { i, j, k });
    }
    return mSwitchThumbStateList;
  }
  
  private ColorStateList getSwitchTrackColorStateList()
  {
    if (mSwitchTrackStateList == null)
    {
      int i = getThemeAttrColor(16842800, 0.1F);
      int j = getThemeAttrColor(R.attr.colorControlActivated, 0.3F);
      int[] arrayOfInt = new int[0];
      int k = getThemeAttrColor(16842800, 0.3F);
      mSwitchTrackStateList = new ColorStateList(new int[][] { { -16842910 }, { 16842912 }, arrayOfInt }, new int[] { i, j, k });
    }
    return mSwitchTrackStateList;
  }
  
  private static boolean isInTintList(int paramInt)
  {
    return (arrayContains(TINT_COLOR_BACKGROUND_MULTIPLY, paramInt)) || (arrayContains(TINT_COLOR_CONTROL_NORMAL, paramInt)) || (arrayContains(TINT_COLOR_CONTROL_ACTIVATED, paramInt)) || (arrayContains(TINT_COLOR_CONTROL_STATE_LIST, paramInt)) || (arrayContains(CONTAINERS_WITH_TINT_CHILDREN, paramInt));
  }
  
  int getDisabledThemeAttrColor(int paramInt)
  {
    mContext.getTheme().resolveAttribute(16842803, mTypedValue, true);
    return getThemeAttrColor(paramInt, mTypedValue.getFloat());
  }
  
  public Drawable getDrawable(int paramInt)
  {
    Drawable localDrawable = ContextCompat.getDrawable(mContext, paramInt);
    if (localDrawable != null)
    {
      if (arrayContains(TINT_COLOR_CONTROL_STATE_LIST, paramInt)) {
        return new TintDrawableWrapper(localDrawable, getDefaultColorStateList());
      }
      if (paramInt == R.drawable.abc_switch_track_mtrl_alpha) {
        return new TintDrawableWrapper(localDrawable, getSwitchTrackColorStateList());
      }
      if (paramInt == R.drawable.abc_switch_thumb_material) {
        return new TintDrawableWrapper(localDrawable, getSwitchThumbColorStateList(), PorterDuff.Mode.MULTIPLY);
      }
      if (arrayContains(CONTAINERS_WITH_TINT_CHILDREN, paramInt)) {
        return mResources.getDrawable(paramInt);
      }
      tintDrawable(paramInt, localDrawable);
    }
    return localDrawable;
  }
  
  int getThemeAttrColor(int paramInt)
  {
    if (mContext.getTheme().resolveAttribute(paramInt, mTypedValue, true))
    {
      if ((mTypedValue.type >= 16) && (mTypedValue.type <= 31)) {
        return mTypedValue.data;
      }
      if (mTypedValue.type == 3) {
        return mResources.getColor(mTypedValue.resourceId);
      }
    }
    return 0;
  }
  
  int getThemeAttrColor(int paramInt, float paramFloat)
  {
    paramInt = getThemeAttrColor(paramInt);
    return paramInt & 0xFFFFFF | Math.round(Color.alpha(paramInt) * paramFloat) << 24;
  }
  
  void tintDrawable(int paramInt, Drawable paramDrawable)
  {
    Object localObject1;
    int j;
    int i;
    if (arrayContains(TINT_COLOR_CONTROL_NORMAL, paramInt))
    {
      paramInt = R.attr.colorControlNormal;
      localObject1 = null;
      j = 1;
      i = -1;
    }
    for (;;)
    {
      if (j != 0)
      {
        Object localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = DEFAULT_MODE;
        }
        paramInt = getThemeAttrColor(paramInt);
        localObject1 = COLOR_FILTER_CACHE.get(paramInt, (PorterDuff.Mode)localObject2);
        if (localObject1 != null) {
          break label182;
        }
        localObject1 = new PorterDuffColorFilter(paramInt, (PorterDuff.Mode)localObject2);
        COLOR_FILTER_CACHE.put(paramInt, (PorterDuff.Mode)localObject2, (PorterDuffColorFilter)localObject1);
      }
      label182:
      for (;;)
      {
        paramDrawable.setColorFilter((ColorFilter)localObject1);
        if (i != -1) {
          paramDrawable.setAlpha(i);
        }
        return;
        if (arrayContains(TINT_COLOR_CONTROL_ACTIVATED, paramInt))
        {
          paramInt = R.attr.colorControlActivated;
          localObject1 = null;
          j = 1;
          i = -1;
          break;
        }
        if (arrayContains(TINT_COLOR_BACKGROUND_MULTIPLY, paramInt))
        {
          localObject1 = PorterDuff.Mode.MULTIPLY;
          j = 1;
          i = -1;
          paramInt = 16842801;
          break;
        }
        if (paramInt != R.drawable.abc_list_divider_mtrl_alpha) {
          break label185;
        }
        paramInt = 16842800;
        i = Math.round(40.8F);
        localObject1 = null;
        j = 1;
        break;
      }
      label185:
      i = -1;
      paramInt = 0;
      localObject1 = null;
      j = 0;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.TintManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */