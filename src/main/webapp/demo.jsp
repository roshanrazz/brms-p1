        <!-- Modal Update Route-->
<div class="modal fade" id="editRouteModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h1 class="modal-title fs-5" id="exampleModalLabel">Update Route to Database</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <form action="updateroute">
      <div class="modal-body">
  
        <div class="mb-3">
          <label for="exampleFormControlInput1" class="form-label">Route Id</label>
          <input type="text" value="<%=request.getParameter("routeid") %>" class="form-control" name="routeId" id="exampleFormControlInput1" placeholder="Route Id">
        </div>
        <div class="mb-3">
          <label for="exampleFormControlInput1" class="form-label">Bus Registration Number</label>
          <input type="text" class="form-control" name="busRid" id="exampleFormControlInput1" placeholder="Bus Registration Number">
        </div>
        <div class="mb-3">
          <label for="exampleFormControlInput1" class="form-label">Source</label>
          <input type="text" class="form-control" name="source" id="exampleFormControlInput1" placeholder="Source">
        </div>
        <div class="mb-3">
          <label for="exampleFormControlInput1" class="form-label">Destination</label>
          <input type="text" class="form-control" name="destination" id="exampleFormControlInput1" placeholder="Destination">
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Update Route</button>
      </div>
    </form>
    </div>
  </div>
</div>
