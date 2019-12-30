package BehaviorPattern.ResponsibilityChain;

public interface Filter {
    void doFilter(Request request,ResponsibilityChain chain);
}
