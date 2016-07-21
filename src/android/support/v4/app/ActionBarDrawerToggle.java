package android.support.v4.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.DrawerListener;
import android.view.MenuItem;
import android.view.View;

public class ActionBarDrawerToggle
  implements DrawerLayout.DrawerListener
{
  private static final int ID_HOME = 16908332;
  private static final ActionBarDrawerToggle.ActionBarDrawerToggleImpl IMPL = new ActionBarDrawerToggle.ActionBarDrawerToggleImplBase(null);
  private final Activity mActivity;
  private final ActionBarDrawerToggle.Delegate mActivityImpl;
  private final int mCloseDrawerContentDescRes;
  private Drawable mDrawerImage;
  private final int mDrawerImageResource;
  private boolean mDrawerIndicatorEnabled = true;
  private final DrawerLayout mDrawerLayout;
  private final int mOpenDrawerContentDescRes;
  private Object mSetIndicatorInfo;
  private ActionBarDrawerToggle.SlideDrawable mSlider;
  private Drawable mThemeImage;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      IMPL = new ActionBarDrawerToggle.ActionBarDrawerToggleImplHC(null);
      return;
    }
  }
  
  public ActionBarDrawerToggle(Activity paramActivity, DrawerLayout paramDrawerLayout, int paramInt1, int paramInt2, int paramInt3)
  {
    mActivity = paramActivity;
    mDrawerLayout = paramDrawerLayout;
    mDrawerImageResource = paramInt1;
    mOpenDrawerContentDescRes = paramInt2;
    mCloseDrawerContentDescRes = paramInt3;
    mThemeImage = getThemeUpIndicator();
    mDrawerImage = paramActivity.getResources().getDrawable(paramInt1);
    mSlider = new ActionBarDrawerToggle.SlideDrawable(mDrawerImage);
    mSlider.setOffsetBy(0.33333334F);
    if ((paramActivity instanceof ActionBarDrawerToggle.DelegateProvider))
    {
      mActivityImpl = ((ActionBarDrawerToggle.DelegateProvider)paramActivity).getDrawerToggleDelegate();
      return;
    }
    mActivityImpl = null;
  }
  
  Drawable getThemeUpIndicator()
  {
    if (mActivityImpl != null) {
      return mActivityImpl.getThemeUpIndicator();
    }
    return IMPL.getThemeUpIndicator(mActivity);
  }
  
  public boolean isDrawerIndicatorEnabled()
  {
    return mDrawerIndicatorEnabled;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    mThemeImage = getThemeUpIndicator();
    mDrawerImage = mActivity.getResources().getDrawable(mDrawerImageResource);
    syncState();
  }
  
  public void onDrawerClosed(View paramView)
  {
    mSlider.setOffset(0.0F);
    if (mDrawerIndicatorEnabled) {
      setActionBarDescription(mCloseDrawerContentDescRes);
    }
  }
  
  public void onDrawerOpened(View paramView)
  {
    mSlider.setOffset(1.0F);
    if (mDrawerIndicatorEnabled) {
      setActionBarDescription(mOpenDrawerContentDescRes);
    }
  }
  
  public void onDrawerSlide(View paramView, float paramFloat)
  {
    float f = mSlider.getOffset();
    if (paramFloat > 0.5F) {}
    for (paramFloat = Math.max(f, Math.max(0.0F, paramFloat - 0.5F) * 2.0F);; paramFloat = Math.min(f, paramFloat * 2.0F))
    {
      mSlider.setOffset(paramFloat);
      return;
    }
  }
  
  public void onDrawerStateChanged(int paramInt) {}
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if ((paramMenuItem != null) && (paramMenuItem.getItemId() == 16908332) && (mDrawerIndicatorEnabled))
    {
      if (mDrawerLayout.isDrawerVisible(8388611)) {
        mDrawerLayout.closeDrawer(8388611);
      }
      for (;;)
      {
        return true;
        mDrawerLayout.openDrawer(8388611);
      }
    }
    return false;
  }
  
  void setActionBarDescription(int paramInt)
  {
    if (mActivityImpl != null)
    {
      mActivityImpl.setActionBarDescription(paramInt);
      return;
    }
    mSetIndicatorInfo = IMPL.setActionBarDescription(mSetIndicatorInfo, mActivity, paramInt);
  }
  
  void setActionBarUpIndicator(Drawable paramDrawable, int paramInt)
  {
    if (mActivityImpl != null)
    {
      mActivityImpl.setActionBarUpIndicator(paramDrawable, paramInt);
      return;
    }
    mSetIndicatorInfo = IMPL.setActionBarUpIndicator(mSetIndicatorInfo, mActivity, paramDrawable, paramInt);
  }
  
  public void setDrawerIndicatorEnabled(boolean paramBoolean)
  {
    int i;
    if (paramBoolean != mDrawerIndicatorEnabled)
    {
      if (!paramBoolean) {
        break label54;
      }
      ActionBarDrawerToggle.SlideDrawable localSlideDrawable = mSlider;
      if (!mDrawerLayout.isDrawerOpen(8388611)) {
        break label46;
      }
      i = mOpenDrawerContentDescRes;
      setActionBarUpIndicator(localSlideDrawable, i);
    }
    for (;;)
    {
      mDrawerIndicatorEnabled = paramBoolean;
      return;
      label46:
      i = mCloseDrawerContentDescRes;
      break;
      label54:
      setActionBarUpIndicator(mThemeImage, 0);
    }
  }
  
  public void syncState()
  {
    ActionBarDrawerToggle.SlideDrawable localSlideDrawable;
    if (mDrawerLayout.isDrawerOpen(8388611))
    {
      mSlider.setOffset(1.0F);
      if (mDrawerIndicatorEnabled)
      {
        localSlideDrawable = mSlider;
        if (!mDrawerLayout.isDrawerOpen(8388611)) {
          break label67;
        }
      }
    }
    label67:
    for (int i = mOpenDrawerContentDescRes;; i = mCloseDrawerContentDescRes)
    {
      setActionBarUpIndicator(localSlideDrawable, i);
      return;
      mSlider.setOffset(0.0F);
      break;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.ActionBarDrawerToggle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */