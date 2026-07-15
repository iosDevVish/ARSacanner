package com.ardrawing.ardrawing.di;

import android.app.Application;
import com.ardrawing.ardrawing.repository.DrawingRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class RepositoryModule_ProvideDrawingRepositoryFactory implements Factory<DrawingRepository> {
  private final Provider<Application> applicationProvider;

  public RepositoryModule_ProvideDrawingRepositoryFactory(
      Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public DrawingRepository get() {
    return provideDrawingRepository(applicationProvider.get());
  }

  public static RepositoryModule_ProvideDrawingRepositoryFactory create(
      javax.inject.Provider<Application> applicationProvider) {
    return new RepositoryModule_ProvideDrawingRepositoryFactory(Providers.asDaggerProvider(applicationProvider));
  }

  public static RepositoryModule_ProvideDrawingRepositoryFactory create(
      Provider<Application> applicationProvider) {
    return new RepositoryModule_ProvideDrawingRepositoryFactory(applicationProvider);
  }

  public static DrawingRepository provideDrawingRepository(Application application) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideDrawingRepository(application));
  }
}
